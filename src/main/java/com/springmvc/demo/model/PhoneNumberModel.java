package com.springmvc.demo.model;

/**
 * User: jinchao.xu
 * Date: 14-12-24
 * Time: 下午12:02
 */
public class PhoneNumberModel {
    private String areaCode;//区号
    private String phoneNumber;//电话号码

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
