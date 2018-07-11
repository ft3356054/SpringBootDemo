package com.example.demo.cache;


import java.util.Set;


public final class RedisClient {
/*

    private static String ADDR = "127.0.0.1";   //Redis服务器IP  192.168.233.131
    private static int PORT = 6379;   //Redis的端口号
    private static String AUTH = null;//"admin";//访问密码
    private static int MAX_ACTIVE = 1024;//可用连接实例的最大数目，默认值为8；如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个jedis实例，则此时pool的状态为exhausted(耗尽)。
    private static int MAX_IDLE = 200; //控制一个pool最多有多少个状态为idle(空闲的)的jedis实例，默认值也是8。
    private static int MAX_WAIT = 10000;//等待可用连接的最大时间，单位毫秒，默认值为-1，表示永不超时。如果超过等待时间，则直接抛出JedisConnectionException；
    private static int TIMEOUT = 10000;
    private static boolean TEST_ON_BORROW = true;//在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；
    private static JedisPool jedisPool = null;

    /**
     * 初始化Redis连接池
     *
    static {
        try {
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxActive(MAX_ACTIVE);
            config.setMaxIdle(MAX_IDLE);
            config.setMaxWait(MAX_WAIT);
            config.setTestOnBorrow(TEST_ON_BORROW);
            jedisPool = new JedisPool(config, ADDR, PORT, TIMEOUT, AUTH);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取Jedis实例
     * @return
     *
    public synchronized static Jedis getJedis() {
        try {
            if (jedisPool != null) {
                Jedis resource = jedisPool.getResource();
                return resource;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    private static Jedis jedis = getJedis();

    /**
     * 释放jedis资源
     * @param jedis
     *
    public static void returnResource(final Jedis jedis) {
        if (jedis != null) {
            jedisPool.returnResource(jedis);
        }
    }

    /**
     * 通过key删除（字节）
     * @param key
     *
    public void del(byte [] key){
        jedis.del(key);
    }
    /**
     * 通过key删除
     * @param key
     *
    public void del(String key){
        jedis.del(key);
    }

    /**
     * 添加key value 并且设置存活时间(byte)
     * @param key
     * @param value
     * @param liveTime
     *
    public void set(byte [] key,byte [] value,int liveTime){
        this.set(key, value);
        jedis.expire(key, liveTime);
    }
    /**
     * 添加key value 并且设置存活时间
     * @param key
     * @param value
     * @param liveTime
     *
    public void set(String key,String value,int liveTime){
        this.set(key, value);
        jedis.expire(key, liveTime);
    }
    /**
     * 添加key value
     * @param key
     * @param value
     *
    public void set(String key,String value){
        jedis.set(key, value);
    }
    /**添加key value (字节)(序列化)
     * @param key
     * @param value
     *
    public void set(byte [] key,byte [] value){
        jedis.set(key, value);
    }
    /**
     * 获取redis value (String)
     * @param key
     * @return
     *
    public String get(String key){
        String value = jedis.get(key);
        return value;
    }
    /**
     * 获取redis value (byte [] )(反序列化)
     * @param key
     * @return
     *
    public byte[] get(byte [] key){
        return jedis.get(key);
    }

    /**
     * 通过正则匹配keys
     * @param pattern
     * @return
     *
    public Set<String> keys(String pattern){
        return jedis.keys(pattern);
    }

    /**
     * 检查key是否已经存在
     * @param key
     * @return
     *
    public boolean exists(String key){
        return jedis.exists(key);
    }
    /**
     * 清空redis 所有数据
     * @return
     *
    public String flushDB(){
        return jedis.flushDB();
    }
    /**
     * 查看redis里有多少数据
     *
    public long dbSize(){
        return jedis.dbSize();
    }
    /**
     * 检查是否连接成功
     * @return
     *
    public String ping(){
        return jedis.ping();
    }


    public static void main(String[] args) {
        Jedis jedis = RedisClient.getJedis();
        jedis.set("name", "wxw");
        System.out.println(jedis.get("name"));
        RedisClient.returnResource(jedis);
    }
*/
}
