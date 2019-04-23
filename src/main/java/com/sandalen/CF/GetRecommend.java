package com.sandalen.CF;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.PairFunction;
import scala.Tuple2;
import scala.Tuple3;

import java.util.*;

public class GetRecommend {
    public static  JavaRDD<List<RecommendItem>> GetRecommend(JavaRDD<CommonUse> commonUse, JavaRDD<ItemSimilarity> ItemSimilarity,final int rec_num)
    {
        //(id,1)
        JavaPairRDD<String, Double> c_rdd1 = commonUse.mapToPair(new PairFunction<CommonUse, String, Double>(){
            @Override
            public Tuple2<String, Double> call(CommonUse commonUse) throws Exception {
                Tuple2<String, Double> tuple2 = new Tuple2<>(commonUse.getItemid(), 1.0);
                return tuple2;
            }
        });
        //(id,(id,simi))
        JavaPairRDD<String, Tuple2<String, Double>> i_rdd1 = ItemSimilarity.mapToPair(new PairFunction<ItemSimilarity, String, Tuple2<String, Double>>() {
            @Override
            public Tuple2<String, Tuple2<String, Double>> call(ItemSimilarity itemSimilarity) throws Exception {
                Tuple2<String, Double> tuple2 = new Tuple2<>(itemSimilarity.getItemid2(), itemSimilarity.getSimi());
                Tuple2<String, Tuple2<String, Double>> t2 = new Tuple2<>(itemSimilarity.getItemid1(), tuple2);

                return t2;
            }


        });
        //(id,(1,(id,simi)))

        JavaPairRDD<String, Tuple2<Double, Tuple2<String, Double>>> rdd1 = c_rdd1.join(i_rdd1);

        //(id,(id,simi))
        JavaPairRDD<String, Tuple2<String, Double>> rdd2 = rdd1.mapToPair(new PairFunction<Tuple2<String, Tuple2<Double, Tuple2<String, Double>>>, String, Tuple2<String, Double>>(){
            @Override
            public Tuple2<String, Tuple2<String, Double>> call(Tuple2<String, Tuple2<Double, Tuple2<String, Double>>> tuple2) throws Exception {
                Tuple2<String, Double> t2 = new Tuple2<>(tuple2._2._2._1, tuple2._2._2._2);

                Tuple2<String, Tuple2<String, Double>> ft = new Tuple2<>(tuple2._1, t2);
                return ft;
            }
        });
        //(simi,(id,id))
        JavaPairRDD<Double, Tuple2<String, String>> simi_rdd = rdd2.mapToPair(new PairFunction<Tuple2<String, Tuple2<String, Double>>, Double, Tuple2<String, String>>(){
            @Override
            public Tuple2<Double, Tuple2<String, String>> call(Tuple2<String, Tuple2<String, Double>> tuple2) throws Exception {
                Tuple2<String, String> tuple21 = new Tuple2<>(tuple2._1, tuple2._2._1);
                Tuple2<Double, Tuple2<String, String>> t2 = new Tuple2<>(tuple2._2._2, tuple21);
                return t2;
            }
        });
        JavaPairRDD<Double, Tuple2<String, String>> sort_rdd = simi_rdd.sortByKey(false);
        System.out.println(sort_rdd.collect());
        //(id,(id,simi))
        JavaPairRDD<String, Tuple2<String, Double>> afterSort_rdd = sort_rdd.mapToPair(new PairFunction<Tuple2<Double, Tuple2<String, String>>, String, Tuple2<String, Double>>(){
            @Override
            public Tuple2<String, Tuple2<String, Double>> call(Tuple2<Double, Tuple2<String, String>> tuple2) throws Exception {
                Tuple2<String, Double> t2 = new Tuple2<>(tuple2._2._2, tuple2._1);
                Tuple2<String, Tuple2<String, Double>> ft = new Tuple2<>(tuple2._2._1, t2);
                return ft;
            }


        });

        System.out.println("afterSort is:"+afterSort_rdd.collect());

        JavaPairRDD<String, Iterable<Tuple2<String, Double>>> rdd3 = afterSort_rdd.groupByKey();

        System.out.println("rdd3:================="+rdd3.collect());

        //(id,id,simi)
        JavaRDD<List<RecommendItem>> recResult_rdd = rdd3.map(new Function<Tuple2<String, Iterable<Tuple2<String, Double>>>, List<RecommendItem>>() {
            @Override
            public List<RecommendItem> call(Tuple2<String, Iterable<Tuple2<String, Double>>> v1) throws Exception {
                HashMap<String, Double> map = new HashMap<>();
                Iterable<Tuple2<String, Double>> iterable = v1._2;
                List<RecommendItem> list = new ArrayList<>();
                HashMap<String, Double> subMap = new HashMap<>();
                int count = 0;
                for (Tuple2<String, Double> t : iterable) {
                    if(count <= rec_num)
                    {
                        map.put(t._1, t._2);
                        System.out.println(v1._1+"======"+t._1+"======"+t._2);
                        RecommendItem item = new RecommendItem(v1._1, t._1, t._2);
                        list.add(item);
                        count++;
                        continue;
                    }
                    break;


                }


               /*  Set<String> keySet = map.keySet();
                Iterator<String> it = keySet.iterator();

               if (map.size() == 0 && map.size() < 0) {
                    return null;
                } else {
                    if (map.size() <= 3) {
                        while (it.hasNext()) {
                            String key = it.next();
                            Double value = map.get(key);
                            System.out.println("yeah，小于3");
                            System.out.println(key +":::"+value);
                            RecommendItem item = new RecommendItem(v1._1, key, value);
                            list.add(item);
                        }
                    } else {
                        int count = 0;
                        while(it.hasNext())
                        {
                            if(count <=3)
                            {
                                String key = it.next();
                                Double value = map.get(key);
                                subMap.put(key,value);
                                RecommendItem item = new RecommendItem(v1._1, key, value);
                                list.add(item);
                                count ++;
                                continue;
                            }
                            break;
                        }

                    }
                    return list;

                }*/
              return list;
            }
        });
        for(List<RecommendItem> list : recResult_rdd.collect())
        {
            for(RecommendItem item : list)
            {
                System.out.println(item.getUserId() + ":::"+item.getItemid() + ":::"+ item.getSimi());
            }
        }

        return recResult_rdd;


    }
}
