package com.chengkz.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * ClassName: Emp
 * Package: com.chengkz.pojo
 * Description:
 * Author 啊吧泽
 * Create 2023/12/9 20:01
 * Version 1.0
 */
@Data
@ToString
@EqualsAndHashCode
@TableName("t_emp")
public class Emp {
    private Long empId;
    private String empName;
    private Double empSalary;
}
