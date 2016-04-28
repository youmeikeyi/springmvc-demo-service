package com.springmvc.demo.model;

import com.sun.istack.internal.NotNull;

/**
 * User: jinchao.xu
 * Date: 14-12-19
 * Time: 下午2:43
 */
public class UserModel {

//    @NotNull(message="{username.not.empty}")
    private String username;
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
