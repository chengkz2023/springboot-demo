package com.chengkz.service;

import com.chengkz.pojo.Emp;

import java.util.List;

/**
* ClassName: EmpService
* Package: com.chengkz.service
* Description:
* Author 啊吧泽
* Create 2023/12/23 16:43
* Version 1.0
*/
public interface EmpService {
    List<Emp> getAllEmp();
    int addEmp(Emp emp);
}
