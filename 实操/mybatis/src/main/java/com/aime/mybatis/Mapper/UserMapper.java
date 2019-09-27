package com.aime.mybatis.Mapper;

import com.aime.mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface UserMapper {

    @Select("select * from users")
    List<User> searachAll();

    @Select("select * from users where userid=#{userId}")
    User searachOne(@RequestParam("id") Integer id);
}
