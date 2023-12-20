package com.chengkz.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;
import com.baomidou.mybatisplus.generator.query.SQLQuery;

/**
 * ClassName: MySQLGeneratorTest
 * Package: com.chengkz.generator
 * Description:
 * Author 啊吧泽
 * Create 2023/12/16 14:33
 * Version 1.0
 */
public class MySQLGeneratorTest {
    private static final DataSourceConfig DATA_SOURCE_CONFIG = new DataSourceConfig
            .Builder("jdbc:mysql://192.168.116.166:3306/mybatis-example?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai", "root", "root")
            .schema("mybatis-example")
            .keyWordsHandler(new MySqlKeyWordsHandler())
            .build();


    public static void main(String[] args) {
        new GlobalConfig.Builder().fileOverride()
                .outputDir(System.getProperty("user.dir") + "/src/main/java")
                .author("chengkz")
                //.enableKotlin()
                //.enableSwagger()
                .dateType(DateType.ONLY_DATE)
                .commentDate("yyyy-MM-dd")
                .build();
        new PackageConfig.Builder()
                .parent("com.chengkz.generator")
                .moduleName("mybatis-plus-generator-demo")
//                .entity("po")
//                .service("service")
//                .serviceImpl("service.impl")
//                .mapper("mapper")
//                .xml("mapper.xml")
//                .controller("controller")
                .build();
        AutoGenerator generator = new AutoGenerator(DATA_SOURCE_CONFIG);
        generator.execute();
    }
}
