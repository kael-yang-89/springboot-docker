package com.yang.springboot.entity;

/**
 * package:com.example.firstspringboot.entity
 * author:yang
 * date: 2019/1/28  20:32
 * param: ${PARAM}
 * return:${RETURN}
 * Description:${TODO}
 */
public class Cust {
    private String cust_id;
    private String workdate;
    private String phone;
    private String sex;

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public String getWorkdate() {
        return workdate;
    }

    public void setWorkdate(String workdate) {
        this.workdate = workdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Cust{" +
                "cust_id='" + cust_id + '\'' +
                ", workdate='" + workdate + '\'' +
                ", phone=" + phone +
                ", sex='" + sex + '\'' +
                '}';
    }
}
