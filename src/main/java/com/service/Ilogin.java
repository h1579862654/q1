package com.service;

import com.pojo.TPro;
import com.pojo.User;

import java.util.List;

public interface Ilogin {
    /**
     * 获得所有用户
     * @return
     */
    List<User> getAllUser();


    /**
     * 查询手机号码是否注册
     * @param phone
     * @return
     */
    boolean getUserByPhone(String phone);

    /**
     * 登陆验证
     * @param u
     * @return
     */
    User getUser(User u);

    /**
     * 注册用户
     * @param u
     * @return
     */
    boolean regUser(User u);


    /**
     * 添加初始用户角色关系记录
     * @param u
     * @return
     */
    boolean regUserRole(User u);

    /**
     * 添加用户角色关系错误时删除用户
     * @param u
     * @return
     */
    boolean delUser(User u);


    /**
     * 查询用户所有找回问题
     */
    List<TPro> selALLTPro(User u);


    /**
     * 查询找回密码的账户
     */
    User getUserByPro(TPro t);
}
