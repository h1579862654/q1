package com.control;

import com.mapper.Login;
import com.pojo.TFun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class LoginControl {

    @Autowired
    Login lg;

    @RequestMapping("lg")
    public String tst(){
        System.out.println("tst========");
        List<TFun> login = lg.login();
        System.out.println(login.size());
        for (TFun tFun : login) {
            System.out.println(tFun);
        }
        return "index.html";
    }
}
