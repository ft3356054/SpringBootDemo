package com.example.demo.cache;

import java.util.Iterator;
import java.util.Set;


public class RedisJava {
/*
    //连接本地的 Redis 服务
    Jedis jedis = new Jedis("localhost");
    //查看服务是否运行
		System.out.println("Server is running: "+jedis.ping());

    //设置 redis 字符串数据
		/*jedis.set("myKey", "abc");
		jedis.set("myKey1:1234", "abc");
		jedis.set("myKey2:1234", "abc");
		jedis.set("myKey3:1234", "abc");
		jedis.set("myKey4:1234", "abc");*

    // 获取数据并输出
    Set<String> keys = jedis.keys("*");
    Iterator<String> it=keys.iterator() ;
 		while(it.hasNext()){
        String key = it.next();
        System.out.println(key+","+jedis.get(key));
    }

 		/*jedis.flushDB();
 		Set<String> keys1 = jedis.keys("*");
 		Iterator<String> it1=keys1.iterator() ;
 		while(it1.hasNext()){
 			String key = it1.next();
 			System.out.println(key+","+jedis.get(key));
 		}*/

}
