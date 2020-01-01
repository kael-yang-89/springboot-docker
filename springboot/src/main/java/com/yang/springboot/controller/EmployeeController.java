package com.yang.springboot.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yang.springboot.entity.Employee;
import com.yang.springboot.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * package:com.example.firstspringboot.controller
 * author:yang
 * date: 2019/1/28  20:36
 * param: ${PARAM}
 * return:${RETURN}
 * Description:${TODO}
 */
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employeeById")
    public Employee findEmployees() {
        return employeeService.findEmployeeById(100);
    }
    @RequestMapping(value = "/employee2")
    public Employee findEmployeeByMap(@RequestBody Map<String,String> map){
        return employeeService.findEmployeeByMap(map);
    }

    @RequestMapping(value = "/employees11/{name}")
    public List<Employee> findEmployees(@PathVariable String name) {
        return employeeService.findEmployeeByName(name);
    }

    @RequestMapping(value = "/em")
    public String findEmployeesByApi(@RequestParam(name = "dim", required = false, defaultValue = "")
                                                         String dim,
                                             @RequestParam(name = "isAuto", required = false, defaultValue = "1")
                                                         String isAuto,
                                             @RequestParam(name = "targetDt", required = false, defaultValue = "")
                                                         String targetDt,
                                             @RequestBody(required = false)
                                                         Map<String, String> dimAndDt
                                             ){
        return "success"+" dim="+dim+" isAuto="+isAuto+" targetDt="+targetDt+" dimAndDt="+dimAndDt;
    }


    @RequestMapping(value = "/api")
    public String findEmployeesByApi2(
                                     @RequestBody(required = false)
                                             JSONObject param
    ){
        String dim = param.getString("dim");
        String isAuto = param.getString("isAuto");
        String targetDt = param.getString("targetDt");

       JSONArray dimAndDt = param.getJSONArray("dimAndDtMap");
        String key="";
        String value="";
        Map<String,String> map=new HashMap<>(16);
       for(int i=0;i<dimAndDt.size();i++){
           JSONObject object = dimAndDt.getJSONObject(i);
           Object[] array = object.keySet().toArray();
           for(int j=0;j<array.length;j++){
                key = (String)array[j];
                value =(String) object.get(key);
                map.put(key,value);
           }
       }
        return "access "+" dim="+dim+" isAuto="+isAuto+" targetDt="+targetDt+"map="+map;

    }


}
