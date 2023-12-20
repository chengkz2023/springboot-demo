package com.chengkz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: Main
 * Package: com.chengkz
 * Description:
 * Author 啊吧泽
 * Create 2023/12/9 19:57
 * Version 1.0
 */
@MapperScan("com.chengkz.mapper")
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
