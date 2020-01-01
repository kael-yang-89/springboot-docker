package com.yang.springboot.controller;

import com.yang.springboot.entity.Employee;
import com.yang.springboot.services.CustService;
import com.yang.springboot.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * package:com.yang.springboot.controller
 * author:yang
 * date: 2019/1/29  14:32
 * param: ${PARAM}
 * return:${RETURN}
 * Description:${TODO}
 */
@RestController
public class CustController {
    @Autowired
    private CustService custService;
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping(value = "/cust")
    public String findCust(){
        return custService.findCust().toString();
    }



    @RequestMapping(value = "/employee/{id}")
    public Employee findEmployee(@PathVariable("id") Integer id ){
        return employeeService.findEmployeeById(id);
    }
}
