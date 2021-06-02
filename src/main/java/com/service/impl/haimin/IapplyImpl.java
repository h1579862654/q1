package com.service.impl.haimin;

import com.mapper.haimin.ApplyMapper;
import com.pojo.haimin.TApply;
import com.pojo.haimin.TState;
import com.service.Iapply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JAVA第二阶段 JavaWeb
 * @create 2021-06-01 11:23 星期二
 */
@Service
public class IapplyImpl implements Iapply {
    @Autowired
    ApplyMapper ap;
    @Override
    public List<TApply> queryApplys() {
        return ap.queryApply();
    }

    @Override
    public int refuseApply(TState st) {
        if (st.getButto().equals("button1")) {
            //通过按钮
            st.setState(0);
        } else if (st.getButto().equals("button2")) {
            //拒绝按钮
            st.setState(3);
        }
        ap.refuseApplying(st);
        return ap.refuseApply(st);
    }
}
