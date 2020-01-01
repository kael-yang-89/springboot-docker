package com.yang.springboot.services.serviceImpl;

import com.yang.springboot.dao.CustDAO;
import com.yang.springboot.entity.Cust;
import com.yang.springboot.services.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * package:com.yang.springboot.services.serviceImpl
 * author:yang
 * date: 2019/1/29  14:28
 * param: ${PARAM}
 * return:${RETURN}
 * Description:${TODO}
 */
@Service
public class CustServiceImpl implements CustService {
    @Autowired
    private CustDAO custDAO;


    @Override
    public Cust findCust() {
        return custDAO.selectCust();
    }
}
