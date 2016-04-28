package com.springmvc.demo.service;

import com.springmvc.demo.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * User: jinchao.xu
 * Date: 14-12-19
 * Time: 下午2:40
 */
@Service("userService")
public class UserService {

    public void create(UserModel userModel){

    }

    public void update(UserModel userModel){

    }

    public UserModel get(String name){
        return new UserModel();
    }
    public void delete(UserModel userModel){

    }

    public List<UserModel> list() {
        return new ArrayList<UserModel>();
    }

}
