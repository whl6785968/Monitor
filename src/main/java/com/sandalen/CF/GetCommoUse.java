package com.sandalen.CF;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import scala.Tuple2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GetCommoUse {
    public static List<CommonUse> getCommonUse(JavaRDD<String> c_rdd)
    {
        /* [1-4],[1-8] */
        JavaRDD<UserData> c_rdd3 = c_rdd.map(new Function<String, UserData>() {
            public UserData call(String s) {
                String[] strs = s.split("-");
                UserData userData = new UserData(strs[0], strs[1]);
                return userData;
            }

        });
        JavaPairRDD<String, Integer> c_rdd4 = c_rdd3.mapToPair(new PairFunction<UserData, String, Integer>() {
            public Tuple2<String, Integer> call(UserData userData) {
                Tuple2<String, Integer> t2 = new Tuple2<>(userData.getItemid(), 1);
                return t2;
            }

        });
        JavaPairRDD<String, Integer> c_rdd5 = c_rdd4.reduceByKey(new Function2<Integer, Integer, Integer>() {
            @Override
            public Integer call(Integer v1, Integer v2) throws Exception {
                return v1 + v2;
            }
        });


        JavaPairRDD<Integer, String> c_rdd6 = c_rdd5.mapToPair(new PairFunction<Tuple2<String, Integer>, Integer, String>() {
            public Tuple2<Integer, String> call(Tuple2<String, Integer> tuple2) {
                Tuple2<Integer, String> t2 = new Tuple2<>(tuple2._2, tuple2._1);
                return t2;
            }
        });
        JavaPairRDD<Integer, String> c_rdd7 = c_rdd6.sortByKey(false);

        JavaRDD<CommonUse> c_rdd8 = c_rdd7.map(new Function<Tuple2<Integer, String>, CommonUse>() {
            public CommonUse call(Tuple2<Integer, String> t) {
                CommonUse commonUse = new CommonUse(t._2, t._1);
                return commonUse;

            }
        });
        List<CommonUse> take = c_rdd8.take(3);

        return take;

    }
}
