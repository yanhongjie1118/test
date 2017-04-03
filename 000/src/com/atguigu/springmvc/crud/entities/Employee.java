package com.atguigu.springmvc.crud.entities;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.Past;
import java.util.Date;

/**
 * Created by hp on 2017/4/3.
 */
public class Employee {
    private Integer id;
    @NotEmpty
    private String lastName;
    @Email
    private String email;
    private Integer gender;
    private Department department;
    @Past
    @DateTimeFormat(
            pattern = "yyyy-MM-dd"
    )
    private Date birth;
    @NumberFormat(
            pattern = "#,###,###.#"
    )
    private Float salary;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Date getBirth() {
        return this.birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Float getSalary() {
        return this.salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee [id=" + this.id + ", lastName=" + this.lastName + ", email=" + this.email + ", gender=" + this.gender + ", department=" + this.department + ", birth=" + this.birth + ", salary=" + this.salary + "]";
    }

    public Employee(Integer id, String lastName, String email, Integer gender, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
    }

    public Employee() {
    }
}
