package com.chengkz.controller;

import com.chengkz.mapper.EmpMapper;
import com.chengkz.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: EmpController
 * Package: com.chengkz.controller
 * Description:
 * Author 啊吧泽
 * Create 2023/12/9 20:20
 * Version 1.0
 */
@RestController
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private EmpMapper empMapper;

    @GetMapping
    public List<Emp> all(){
        return empMapper.queryAll();
    }
}
