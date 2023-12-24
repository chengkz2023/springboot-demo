package com.chengkz.pojo;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

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
public class Emp implements Serializable {
    private Long empId;
    @NotEmpty(message = "缺少必要参数")
    private String empName;
    private Double empSalary;
}
