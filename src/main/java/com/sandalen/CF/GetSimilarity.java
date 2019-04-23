package com.sandalen.CF;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import scala.Tuple2;
import scala.Tuple3;
import scala.Tuple4;
import scala.Tuple5;

import javax.naming.spi.DirObjectFactory;

public class GetSimilarity {
    public static JavaRDD<ItemSimilarity> getSimilarity(JavaRDD<String> t_rdd)
    {
        JavaRDD<UserData> rdd1 = t_rdd.map(new Function<String, UserData>(){
        	public UserData call(String s)
        	{
    		  String[] strs = s.split("-");
              UserData userData = new UserData(strs[0], strs[1]);
              return userData;
        	}
          
        });

        JavaPairRDD<String, String> rdd2 = rdd1.mapToPair(new PairFunction<UserData, String, String>() {
            @Override
            public Tuple2<String, String> call(UserData userData) throws Exception {
                Tuple2<String, String> t2 = new Tuple2<>(userData.getUserid(), userData.getItemid());
                return t2;
            }
        });

        JavaPairRDD<String, Tuple2<String, String>> rdd3 = rdd2.join(rdd2);

        System.out.println("rdd3 is"+rdd3.collect());

        JavaPairRDD<Tuple2<String, String>, Double> rdd4 = rdd3.mapToPair(new PairFunction<Tuple2<String, Tuple2<String, String>>, Tuple2<String, String>, Double>() {
            public Tuple2 call(Tuple2<String, Tuple2<String, String>> tuple2) {
                Tuple2<Tuple2<String, String>, Double> t2 = new Tuple2<Tuple2<String, String>, Double>(tuple2._2, 1.0);
                return t2;
            }
        });
        System.out.println("rdd4 is"+ rdd4.collect());

        JavaPairRDD<Tuple2<String, String>, Double> rdd5 = rdd4.reduceByKey(new Function2<Double, Double, Double>() {
            @Override
            public Double call(Double v1, Double v2) throws Exception {
                return v1 + v2;
            }
        });

        System.out.println("rdd5 is"+rdd5.collect());
        //对角阵
        JavaPairRDD<Tuple2<String, String>, Double> rdd6 = rdd5.filter(new Function<Tuple2<Tuple2<String, String>, Double>, Boolean>() {
            @Override
            public Boolean call(Tuple2<Tuple2<String, String>, Double> v1) throws Exception {
                if (v1._1._1.equals(v1._1._2)) {
                    return true;
                }
                return false;
            }
        });

        System.out.println("rdd6 is"+rdd6.collect());
        //非对角阵
        JavaPairRDD<Tuple2<String, String>, Double> rdd7 = rdd5.filter(new Function<Tuple2<Tuple2<String, String>, Double>, Boolean>() {
            @Override
            public Boolean call(Tuple2<Tuple2<String, String>, Double> v1) throws Exception {
                if (!v1._1._1.equals(v1._1._2)) {
                    return true;
                }
                return false;
            }
        });

        System.out.println("rdd7 is"+rdd7.collect());

        //(1,(1,2,3))
        JavaPairRDD<String, Tuple3> rdd8 = rdd7.mapToPair(new PairFunction<Tuple2<Tuple2<String, String>, Double>, String, Tuple3>() {
            public Tuple2 call(Tuple2<Tuple2<String, String>, Double> t) {
                Tuple3<String, String, Double> t3 = new Tuple3<>(t._1._1, t._1._2, t._2);
                Tuple2<String, Tuple3<String, String, Double>> t2 = new Tuple2<>(t._1._1, t3);

                return t2;
            }
        });
        JavaPairRDD<String, Double> rdd9 = rdd6.mapToPair(new PairFunction<Tuple2<Tuple2<String, String>, Double>, String, Double>() {
            @Override
            public Tuple2<String, Double> call(Tuple2<Tuple2<String, String>, Double> t) throws Exception {
                Tuple2<String, Double> t2 = new Tuple2<>(t._1._1, t._2);
                return t2;
            }
        });

        //(1,((1,2,3),4))
        JavaPairRDD<String, Tuple2<Tuple3, Double>> rdd10 = rdd8.join(rdd9);
        //(2,(1,2,3,4))
        JavaPairRDD<String, Tuple4> rdd11 = rdd10.mapToPair(new PairFunction<Tuple2<String, Tuple2<Tuple3, Double>>, String, Tuple4>() {
            public Tuple2 call(Tuple2<String, Tuple2<Tuple3, Double>> t2) {
                Tuple2<Tuple3, Double> t = t2._2;
                Tuple3<String,String,Double> t3 = t._1;
                Tuple4<String, String, Double, Double> t4 = new Tuple4<>(t3._1(), t3._2(), t3._3(), t._2);
                Tuple2<String, Tuple4<String, String, Double, Double>> tf = new Tuple2<>(t3._2(), t4);
                return tf;

            }
        });
        //(2,count)
        JavaPairRDD<String, Double> rdd12 = rdd6.mapToPair(new PairFunction<Tuple2<Tuple2<String, String>, Double>, String, Double>() {
            @Override
            public Tuple2<String, Double> call(Tuple2<Tuple2<String, String>, Double> t) throws Exception {
                Tuple2<String, Double> t2 = new Tuple2<>(t._1._2, t._2);
                return t2;
            }
        });
        //(2,((1,2,3,4),count))
        JavaPairRDD<String, Tuple2<Tuple4, Double>> rdd13 = rdd11.join(rdd12);
        JavaRDD<Tuple5> rdd14 = (JavaRDD<Tuple5>) rdd13.map(
                new Function<Tuple2<String, Tuple2<Tuple4, Double>>, Tuple5>() {
                    @Override
                    public Tuple5 call(Tuple2<String, Tuple2<Tuple4, Double>> v1) throws Exception {
                        Tuple2<Tuple4, Double> t2 = v1._2;
                        Tuple4<String,String,Double,Double> t4 = t2._1;
                        Double count = t2._2;
                        Tuple5<String, String, Double, Double, Double> t5 = new Tuple5<>(t4._1(), t4._2(), t4._3(), t4._4(), count);
                        return t5;
                    }
                }
        );
        JavaPairRDD<Tuple2<String, String>, Double> rdd15 = rdd14.mapToPair(new PairFunction<Tuple5, Tuple2<String, String>, Double>(){
            @Override
            public Tuple2<Tuple2<String, String>, Double> call(Tuple5 tuple5) throws Exception {
                Tuple5<String, String, Double, Double, Double> t5 = tuple5;
                Tuple2<String, String> tuple2 = new Tuple2<>(t5._1(), t5._2());
                Double simi = t5._3() / Math.sqrt(t5._4() * t5._5());
                Tuple2<Tuple2<String, String>, Double> t2 = new Tuple2<>(tuple2, simi);
                return t2;
            }


        });

        System.out.println("rdd15 is"+rdd15.collect());
        JavaRDD<ItemSimilarity> itemSimi = rdd15.map(new Function<Tuple2<Tuple2<String, String>, Double>, ItemSimilarity>() {
            @Override
            public ItemSimilarity call(Tuple2<Tuple2<String, String>, Double> v1) throws Exception {
                ItemSimilarity itemSimilarity = new ItemSimilarity(v1._1._1, v1._1._2, v1._2);
                return itemSimilarity;
            }
        });

        return itemSimi;
    }
}
