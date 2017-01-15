package com.ltx.dao.cache;

import com.ltx.entity.Seckill;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by Rain on 2017/1/15.
 */
public class RedisDao {
    private JedisPool jedisPool;

    public RedisDao(String ip, int port) {
        this.jedisPool = new JedisPool(ip, port);
    }

    public Seckill getSeckill(long seckillId) {
        //redis 逻辑操作
        Jedis jedis = jedisPool.getResource();

        String key = "seckill:" + seckillId;
        //并没有实现内部序列化操作
        // get-->byte[] -->  反序列化  -->Object(Seckill)
        //采用自定义序列化
        //protostuff : pojo

        return null;
    }

    public String putSeckill(Seckill seckill) {
        return null;
    }

}
