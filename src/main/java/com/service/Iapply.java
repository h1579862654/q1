package com.service;

import com.pojo.haimin.TApply;
import com.pojo.haimin.TState;

import java.util.List;

/**
 * @author JAVA第二阶段 JavaWeb
 * @create 2021-06-01 11:20 星期二
 */
public interface Iapply {
    /**
     * 查询申请表
     * @return
     */
    List<TApply> queryApplys();

    /**
     * 删除按钮调用
     * @key
     * @return 返回1成功2失败
     */
    int refuseApply(TState st);
}
