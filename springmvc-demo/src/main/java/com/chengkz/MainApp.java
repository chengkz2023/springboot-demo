package com.chengkz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: MainApp
 * Package: com.chengkz
 * Description:
 * Author 啊吧泽
 * Create 2023/12/10 16:41
 * Version 1.0
 */


@MapperScan("com.chengkz.mapper")
@SpringBootApplication
public class MainApp {
    public static void main(String[] args) {
        SpringApplication.run(MainApp.class,args);
    }
}
