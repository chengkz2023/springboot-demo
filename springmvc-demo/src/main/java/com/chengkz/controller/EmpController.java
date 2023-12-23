package com.chengkz.controller;


import com.chengkz.pojo.Emp;
import com.chengkz.result.ApiResponse;
import com.chengkz.service.EmpService;
import com.chengkz.service.impl.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping
public class EmpController {
    @Autowired
    private EmpServiceImpl empService;

    @GetMapping("emp")
    public ApiResponse<List<Emp>> all(){
        return ApiResponse.success(empService.getAllEmp());
    }

    @GetMapping("add")
    public ApiResponse add(){
        Emp emp = new Emp();
        emp.setEmpName("ckz");
        emp.setEmpSalary(10000.111);
        empService.addEmp(emp);
        return ApiResponse.success();
    }

    @GetMapping("param1")
    public String param1(String name,int age){
        System.out.println("name = " + name + ", age = " + age);
        return  name +":"+ age;
    }
    @GetMapping("param2")
    public String param2(@RequestParam("name") String name, @RequestParam("stu_age") int age){
        System.out.println("name = " + name + ", age = " + age);
        return  name +":"+ age;
    }

    @GetMapping("param3")
    public String param3(@RequestParam(value = "name",required = false) String name, @RequestParam("stu_age") int age){
        System.out.println("name = " + name + ", age = " + age);
        return  name +":"+ age;
    }
    @GetMapping("param4")
    public String param4(@RequestParam(value = "name",required = false,defaultValue = "小黑子") String name, @RequestParam("stu_age") int age){
        System.out.println("name = " + name + ", age = " + age);
        return  name +":"+ age;
    }

    @GetMapping("param5")
    public Emp param5(Emp emp){
        System.out.println(emp.toString());
        return emp;
    }
    @PostMapping("param5")
    public Emp paramp5(Emp emp){
        System.out.println(emp.toString());
        return emp;
    }
    /**
     * 前端请求: http://localhost:8080/param/mul?hbs=吃&hbs=喝
     *
     *  一名多值,可以使用集合接收即可!但是需要使用@RequestParam注解指定
     */
    @GetMapping(value="/mul")
    public Object mulForm(@RequestParam List<String> hbs){
        System.out.println("hbs = " + hbs);
        return hbs;
    }

    /**
     * 动态路径设计: /user/{动态部分}/{动态部分}   动态部分使用{}包含即可! {}内部动态标识!
     * 形参列表取值: @PathVariable Long id  如果形参名 = {动态标识} 自动赋值!
     *              @PathVariable("动态标识") Long id  如果形参名 != {动态标识} 可以通过指定动态标识赋值!
     *
     * 访问测试:  /param/user/1/root  -> id = 1  uname = root
     */
    @GetMapping("/user/{id}/{name}")
    @ResponseBody
    public String getUser(@PathVariable Long id,
                          @PathVariable("name") String uname) {
        System.out.println("id = " + id + ", uname = " + uname);
        return "user_detail";
    }


}
