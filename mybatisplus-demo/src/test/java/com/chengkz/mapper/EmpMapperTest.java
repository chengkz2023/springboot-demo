package com.chengkz.mapper;

import com.chengkz.pojo.Emp;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * ClassName: EmpMapperTest
 * Package: mapper
 * Description:
 * Author 啊吧泽
 * Create 2023/12/9 20:14
 * Version 1.0
 */
@Slf4j
@SpringBootTest
public class EmpMapperTest {
    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testAll(){
        List<Emp> empList =  empMapper.selectList(null);
        empList.forEach(System.out::println);
    }
}
