package com.yang.springboot.dao;

import com.yang.springboot.entity.Cust;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * package:com.yang.springboot.dao
 * author:yang
 * date: 2019/1/29  14:30
 * param: ${PARAM}
 * return:${RETURN}
 * Description:${TODO}
 */

public interface CustDAO {
    Cust selectCust();
}
