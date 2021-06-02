package com.control.haimin;

import com.pojo.haimin.TState;
import com.service.Iapply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JAVA第二阶段 JavaWeb
 * @create 2021-06-01 11:09 星期二
 */

@RestController
public class ApplyControlRefuse {
    @Autowired
    Iapply ia;
    @RequestMapping("applyrefuse")
    public String refuseApply(TState st){
        int i = ia.refuseApply(st);
        System.out.println(st.getKey());
        System.out.println(st.getTime());
        System.out.println(st.getType()+"类型");
        System.out.println(st.getIid()+"类型");
        System.out.println(st.getState()+"状态");
        return i+"";
    }
}
