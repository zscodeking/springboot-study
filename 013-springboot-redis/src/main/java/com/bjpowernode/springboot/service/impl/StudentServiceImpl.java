package com.bjpowernode.springboot.service.impl;

import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    public void put(String key, String value) {
        redisTemplate.opsForValue().set(key,value);
    }

    public String get(String key) {

        String count = (String) redisTemplate.opsForValue().get(key);

        return count;
    }
}
