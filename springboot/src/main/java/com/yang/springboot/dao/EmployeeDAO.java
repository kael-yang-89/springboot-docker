package com.yang.springboot.dao;


import com.yang.springboot.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * package:com.example.firstspringboot.dao
 * author:yang
 * date: 2019/1/28  20:35
 * param: ${PARAM}
 * return:${RETURN}
 * Description:${TODO}
 */

public interface EmployeeDAO {
    Employee selectEmployeeById(Integer id);
    List<Employee> selectEmployeeByName(String name);
    Employee selectEmployeeByMap(Map<String,String> map);
}
