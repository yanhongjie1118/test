package com.atguigu.springmvc.crud.dao;

import com.atguigu.springmvc.crud.entities.Department;
import com.atguigu.springmvc.crud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hp on 2017/4/3.
 *
 */
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;
    @Autowired
    private DepartmentDao departmentDao;
    private static Integer initId;

    static {
        employees = new HashMap();
        employees.put(Integer.valueOf(1001), new Employee(Integer.valueOf(1001), "E-AA", "aa@163.com", Integer.valueOf(1), new Department(101, "D-AA")));
        employees.put(Integer.valueOf(1002), new Employee(Integer.valueOf(1002), "E-BB", "bb@163.com", Integer.valueOf(1), new Department(102, "D-BB")));
        employees.put(Integer.valueOf(1003), new Employee(Integer.valueOf(1003), "E-CC", "cc@163.com", Integer.valueOf(0), new Department(103, "D-CC")));
        employees.put(Integer.valueOf(1004), new Employee(Integer.valueOf(1004), "E-DD", "dd@163.com", Integer.valueOf(0), new Department(104, "D-DD")));
        employees.put(Integer.valueOf(1005), new Employee(Integer.valueOf(1005), "E-EE", "ee@163.com", Integer.valueOf(1), new Department(105, "D-EE")));
        initId = Integer.valueOf(1006);
    }

    public EmployeeDao() {
    }

    public void save(Employee employee) {
        if(employee.getId() == null) {
            Integer var10001 = initId;
            initId = Integer.valueOf(initId.intValue() + 1);
            employee.setId(var10001);
        }

        employee.setDepartment(this.departmentDao.getDepartment(employee.getDepartment().getId()));
        employees.put(employee.getId(), employee);
    }

    public Collection<Employee> getAll() {
        return employees.values();
    }

    public Employee get(Integer id) {
        return (Employee)employees.get(id);
    }

    public void delete(Integer id) {
        employees.remove(id);
    }
}

