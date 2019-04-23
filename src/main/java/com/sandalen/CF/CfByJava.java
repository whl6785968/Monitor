package com.sandalen.CF;

import org.apache.spark.SparkConf;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.List;

public class CfByJava {
    public static void main(String[] args) {
    	SparkConf conf = new SparkConf();
        conf.setAppName("cfByJava");
        conf.setMaster("local[4]");
        JavaSparkContext sc = new JavaSparkContext(conf);
        JavaRDD<String> c_rdd = sc.textFile("C:\\Users\\dell\\Desktop\\java\\collect_of_monitorData\\1.txt");
        JavaRDD<String> t_rdd = sc.textFile("C:\\Users\\dell\\Desktop\\java\\collect_of_monitorData\\cf.txt");

        //获取常用物品
        List<CommonUse> commonUse = GetCommoUse.getCommonUse(c_rdd);

        for(CommonUse cu : commonUse)
        {
            System.out.println(cu.getItemid()+":"+cu.getNum());
        }

        //获取物品相似度
        JavaRDD<ItemSimilarity> similarity = GetSimilarity.getSimilarity(t_rdd);
        System.out.println(similarity.collect());

        JavaRDD<CommonUse> common_use = sc.parallelize(commonUse);
        //获取推荐
        JavaRDD<List<RecommendItem>> rec_rdd = GetRecommend.GetRecommend(common_use, similarity, 3);



    }
}
