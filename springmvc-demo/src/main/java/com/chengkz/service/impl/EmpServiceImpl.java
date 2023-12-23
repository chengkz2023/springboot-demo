package com.chengkz.service.impl;

import com.chengkz.mapper.EmpMapper;
import com.chengkz.pojo.Emp;
import com.chengkz.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: EmpServiceImpl
 * Package: com.chengkz.service.impl
 * Description:
 * Author 啊吧泽
 * Create 2023/12/23 16:46
 * Version 1.0
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;
    @Override
    public List<Emp> getAllEmp() {
        return empMapper.queryAll();
    }

    @Override
    public int addEmp(Emp emp) {
        return empMapper.insertEmp(emp);
    }
}
