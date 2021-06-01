package com.service.impl;

import com.mapper.LoginMapper;
import com.pojo.TPro;
import com.pojo.User;
import com.service.Ilogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ssm20
 * @description:
 * @author: SANJIU HUANG
 * @create: 2021-05-27 09:49
 **/
@Service
public class LoginService implements Ilogin {
    @Autowired
    LoginMapper lm;
    public List<User> getAllUser() {
        System.out.println("LoginService->getAllUser");
        List<User> allUser = lm.getAllUser();
        return  allUser;
    }


    @Override
    public boolean getUserByPhone(String phone) {
        List<User> us = lm.getUserByPhone(phone);
        System.out.println("getUserByPhone方法"+us);
        if(us.isEmpty()){
            return true;
        }
        return false;
    }

    @Override
    public User getUser(User u) {
        System.out.println("LoginService->getUser");

        return lm.getUser(u);
    }

    @Override
    public boolean regUser(User u) {
        int i = lm.regUser(u);
        System.out.println("LoginService-->regUser"+i);
        if(i>0){
            return true;
        }
        return false;
    }

    public boolean regUserRole(User u) {
        int i = lm.regUserRole(u);
        System.out.println("LoginService-->regUserRole"+i);
        if(i>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean delUser(User u) {
        int i = lm.delUser(u);
        System.out.println("LoginService-->delUser"+i);
        if(i>0){
            return true;
        }
        return false;
    }

    @Override
    public List<TPro> selALLTPro(User u) {
        return   lm.selALLTPro(u);
    }

    @Override
    public User getUserByPro(TPro t) {
        User u = lm.getUserByPro(t);
        System.out.println("找到的用户"+u);
        return u;
    }

}
