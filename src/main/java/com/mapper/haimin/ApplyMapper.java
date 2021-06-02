package com.mapper.haimin;

import com.pojo.haimin.TApply;
import com.pojo.haimin.TState;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author JAVA第二阶段 JavaWeb
 * @create 2021-06-01 11:25 星期二
 */
public interface ApplyMapper {
//    @Select("SELECT * FROM t_apply")
    List<TApply> queryApply();
//    @Select("UPDATE t_apply SET state=3 WHERE id=1")代码错误!!!!
    int refuseApply(TState st);
    int refuseApplying(TState st);
}
