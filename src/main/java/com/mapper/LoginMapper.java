package com.mapper;

import com.pojo.TFun;
import com.pojo.TPro;
import com.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LoginMapper {
    @Select("select * from TT_USER")
    List<User> getAllUser();
    List<User> getUserByPhone(String phone);
    User getUser(User u);
    int regUserRole(User u);
    int regUser(User u);
    int delUser(User u);
    List<TPro> selALLTPro(User u);
    User getUserByPro(TPro t);
    List<TFun> getFunsByUser(User u);
}
