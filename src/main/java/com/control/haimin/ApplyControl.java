package com.control.haimin;

import com.alibaba.fastjson.JSONObject;
import com.pojo.haimin.TApply;
import com.service.Iapply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author JAVA第二阶段 JavaWeb
 * @create 2021-06-01 11:09 星期二
 */

@Controller
public class ApplyControl {
    @Autowired
    Iapply ia;
    @RequestMapping("apply")
    @ResponseBody
    public String queryApplyS(){
        List<TApply> tApplies = ia.queryApplys();
//        for (TApply tApply : tApplies) {
//            System.out.println(tApplies.size()+":张海民");
            String s = JSONObject.toJSONString(tApplies);
            System.out.println(s);
//        }
        return s;
    }
}
