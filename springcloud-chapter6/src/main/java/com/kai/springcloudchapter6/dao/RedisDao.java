package com.kai.springcloudchapter6.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

/**
 * 数据操作类
 * Repository注解，将RedisDao注入到Spring IoC容器中
 * 该类通过StringRedisTemplate来访问Redis
 * @author hongok
 * @since 2018-9-11 11:09:35
 */
@Repository
public class RedisDao {

    @Autowired
    private StringRedisTemplate template;

    /**
     * 向Resis数据库中设置String类型的数据
     * @param key
     * @param value
     */
    public void setKey(String key, String value){
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key,value,1, TimeUnit.MINUTES); //1分钟过期
    }

    /**
     * 通过key获取在Redis数据库中所对应的value
     * @param key
     * @return value
     */
    public String getValue(String key){
        ValueOperations<String, String> ops = template.opsForValue();
        return ops.get(key);
    }

}
