package com.example.demo.cache;

import java.util.Date;


/**
 * 使用方法
 * @author miaoxingfu
 * 在spring中配置：
 * <bean id="memcachedClient" class="com.kongzhong.smf.util.tools.MemcachedClient" init-method="init">
<property name="ipAndPort">
<list>
<value>192.168.1.232:11211</value>
<value>192.168.1.232:11213</value>      ----  根据实际情况设置
</list>
</property>
<property name="weight">
<list>
<value>3</value>
<value>3</value>      ----  权重，根据实际情况设置，一般设成一样即可，并注意要跟上面的IP地址的list数量一致
</list>
</property>
</bean>
 *
 */

public class MemcachedClient {
/*
    //spring注入
    protected String[] ipAndPort;
    protected Integer[] weight;

    protected static MemCachedClient mcc = new MemCachedClient();

    public void setIpAndPort(String[] ipAndPort) {
        this.ipAndPort = ipAndPort;
    }

    public void setWeight(Integer[] weight) {
        this.weight = weight;
    }

    public void init(){
        String[] servers =  ipAndPort;
        Integer[] weights = weight;

        //创建一个实例对象SockIOPool
        SockIOPool pool = SockIOPool.getInstance();

        // set the servers and the weights
        pool.setServers( servers );
        pool.setWeights( weights );

        // set some basic pool settings 5 initial, 5 min, and 250 max conns and set the max idle time for a conn to 6 hours
        pool.setInitConn( 5 );
        pool.setMinConn( 5 );
        pool.setMaxConn( 30 );
        pool.setMaxIdle( 1000 * 60 * 60 * 6 );

        // set the sleep for the maint thread it will wake up every x seconds and maintain the pool size
        pool.setMaintSleep( 30 );

        // Tcp的规则就是在发送一个包之前，本地机器会等待远程主机
        // 对上一次发送的包的确认信息到来；这个方法就可以关闭套接字的缓存，
        // 以至这个包准备好了就发；
        pool.setNagle( false );
        //连接建立后对超时的控制
        pool.setSocketTO( 3000 );
        //连接建立时对超时的控制
        pool.setSocketConnectTO( 0 );

        // initialize the connection pool
        pool.initialize();


        // lets set some compression on for the client compress anything larger than 64k
        mcc.setCompressEnable( true );
        mcc.setCompressThreshold( 64 * 1024 );
    }

    /**
     * 把键值对放进cache里
     * @param key
     * @param value
     * @param time
     *
    public void set(String key, String value, long time){
        if(time < 0){
            mcc.set(key,value);
        }else{
            mcc.set(key,value,new Date(time));
        }
    }

    /**
     * 把键值对放进cache里
     * @param key
     * @param value
     * @param time
     *
    public void setObject(String key, Object value, long time){
        if(time < 0){
            mcc.set(key,value);
        }else{
            mcc.set(key,value,new Date(time));
        }
    }

    /**
     * 取出键值
     * @param key
     * @return
     *
    public String get(String key){
        if(key == null){
            return null;
        }
        Object o = mcc.get(key);
        return o == null? null: (String) o;
    }

    public Object getObject(String key){
        if(key == null){
            return null;
        }
        Object o = mcc.get(key);
        return o == null? null: o;
    }

    /**
     * 删除键值
     * @param key
     * @return
     *
    public boolean remove(String key){
        if(key != null){
            return mcc.delete(key);
        }
        return false;
    }

*/
}
