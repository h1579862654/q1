package com.control;

import com.alibaba.fastjson.JSONObject;
import com.pojo.TPro;
import com.pojo.User;
import com.service.Ilogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @program: springBoot
 * @description:
 * @author: SANJIU HUANG
 * @create: 2021-05-28 11:38
 **/
@Controller
public class LoginControl {
    @Autowired
    Ilogin ig;

    @RequestMapping("lg")
    @ResponseBody
    public String login(User u, HttpSession hs){
        System.out.println("LoginControl->login");
        System.out.println(u);
        User user = ig.getUser(u);
        System.out.println("用户"+user);
        hs.setAttribute("user",user);
        if(user != null){
            return "true";
        }
        return "false";
    }
    @RequestMapping("reg")
    @ResponseBody
    public String reg(User u){
        System.out.println("LoginControl->reg");
        System.out.println(u);
        //判断手机号码是否已注册
        if(ig.getUserByPhone(u.getPhone())){
            //注册用户
            if(ig.regUser(u)){
                if(ig.regUserRole(u)){
                    return "true";
                }else{
                    System.out.println("添加用户角色关系出错");
                    //删除用户
                    ig.delUser(u);
                    return "错误";
                }
            }else{
                System.out.println("新增用户出错");
                return "错误";
            }
        }else{
            return "手机号码已注册！";
        }
    }

    @RequestMapping("forgotPwd")
    @ResponseBody
    public String forgotPwd(User u){
        System.out.println("LoginControl->forgotPwd");
        System.out.println(u);
        //判断手机号码是否已注册
        if(!ig.getUserByPhone(u.getPhone())){
            List<TPro> tPros = ig.selALLTPro(u);
            System.out.println(tPros);
            if(tPros.isEmpty()){
                return "2";

            }else{
                JSONObject json = new JSONObject();
                json.put("list",tPros);
                return json.toString();
            }

        }else{
            return "1";
        }




    }
    @RequestMapping("aaa")
    public String aaa(){
        List<User> allUser = ig.getAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }
        return "login.html";
    }

    @RequestMapping("getpass")
    @ResponseBody
    public String getPass(TPro t){
        System.out.println("获得的答案："+t);
        User u = ig.getUserByPro(t);
        if(u==null){
            return "1";
        }
        return u.getPass();
    }



}
