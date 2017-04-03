package com.atguigu.springmvc.crud.entities;

/**
 * Created by hp on 2017/4/3.
 */
public class Department {
    private Integer id;
    private String departmentName;

    public Department() {
    }

    public Department(int i, String string) {
        this.id = Integer.valueOf(i);
        this.departmentName = string;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String toString() {
        return "Department [id=" + this.id + ", departmentName=" + this.departmentName + "]";
    }

}
