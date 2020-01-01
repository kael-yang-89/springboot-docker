package com.yang.springboot.services.serviceImpl;


import com.yang.springboot.dao.EmployeeDAO;
import com.yang.springboot.entity.Employee;
import com.yang.springboot.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * package:com.example.firstspringboot.service.serviceImpl
 * author:yang
 * date: 2019/1/28  20:38
 * param: ${PARAM}
 * return:${RETURN}
 * Description:${TODO}
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public Employee findEmployeeById(Integer id) {
        return employeeDAO.selectEmployeeById(id);
    }

    @Override
    public List<Employee> findEmployeeByName(String name) {
        return employeeDAO.selectEmployeeByName(name);
    }

    @Override
    public Employee findEmployeeByMap(Map<String, String> map) {
        return employeeDAO.selectEmployeeByMap(map);
    }
}
