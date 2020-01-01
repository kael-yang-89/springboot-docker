package com.yang.springboot.services;


import com.yang.springboot.entity.Employee;

import java.util.List;
import java.util.Map;

/**
 * package:com.example.firstspringboot.service
 * author:yang
 * date: 2019/1/28  20:36
 * param: ${PARAM}
 * return:${RETURN}
 * Description:${TODO}
 */
public interface EmployeeService {

  Employee findEmployeeById(Integer id);
  List<Employee> findEmployeeByName(String name);
  Employee findEmployeeByMap(Map<String,String> map);
}
