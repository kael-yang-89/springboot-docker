package com.yang.springboot.controller;

import com.yang.springboot.entity.Employee;
import com.yang.springboot.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

/**
 * package:com.yang.springboot.controller
 * author:yang
 * date: 2019/2/20  10:30
 * param: ${PARAM}
 * return:${RETURN}
 * Description:${TODO}
 */
@Controller
public class HtmlController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping(value = "/hello")
    public String hello(Model m){
        m.addAttribute("msg", DateFormat.getDateInstance().format(new Date()));
        return "hello";
    }
    @RequestMapping(value = "/employee1")
    public String findEmployees(@RequestParam Integer id, Model map) {
        Employee employee = employeeService.findEmployeeById(id);
        System.out.println(employee);
        map.addAttribute("ee",employee) ;
        return "employee";
    }

    @RequestMapping(value = "/employee1/{name}")
    public String findEmployees(@PathVariable String name, ModelMap map) {
        List<Employee> employee = employeeService.findEmployeeByName(name);
        System.out.println(employee);
        map.addAttribute("ee",employee) ;
        return "employee";
    }



}
