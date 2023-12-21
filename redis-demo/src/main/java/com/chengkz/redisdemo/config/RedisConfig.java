package com.chengkz.redisdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;


/**
 * ClassName: RedisConfig
 * Package: com.chengkz.redisdemo.config
 * Description:
 * Author 啊吧泽
 * Create 2023/12/19 21:50
 * Version 1.0
 */
@Configuration
public class RedisConfig {

    //    @Bean
    //    public LettuceConnectionFactory redisConnectionFactory() {
    //        return new LettuceConnectionFactory(new RedisStandaloneConfiguration());
    //    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate(LettuceConnectionFactory connectionFactory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);

        // 配置键序列化器
        template.setKeySerializer(new StringRedisSerializer());

        // 配置值序列化器（这里使用Jackson2序列化）
        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());

        // 配置Hash键（Hash key）序列化器
        template.setHashKeySerializer(new StringRedisSerializer());

        // 配置Hash值（Hash value）序列化器
        template.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());

        // 启用默认序列化
        template.setDefaultSerializer(new GenericJackson2JsonRedisSerializer());

        template.afterPropertiesSet();

        return template;
    }
}
