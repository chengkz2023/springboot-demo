package com.chengkz.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName t_emp
 */
@Data
public class Emp implements Serializable {
    private Integer empId;

    private String empName;

    private Double empSalary;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Emp other = (Emp) that;
        return (this.getEmpId() == null ? other.getEmpId() == null : this.getEmpId().equals(other.getEmpId()))
            && (this.getEmpName() == null ? other.getEmpName() == null : this.getEmpName().equals(other.getEmpName()))
            && (this.getEmpSalary() == null ? other.getEmpSalary() == null : this.getEmpSalary().equals(other.getEmpSalary()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmpId() == null) ? 0 : getEmpId().hashCode());
        result = prime * result + ((getEmpName() == null) ? 0 : getEmpName().hashCode());
        result = prime * result + ((getEmpSalary() == null) ? 0 : getEmpSalary().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empId=").append(empId);
        sb.append(", empName=").append(empName);
        sb.append(", empSalary=").append(empSalary);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}