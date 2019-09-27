package com.aime.mybatis.Controller;

import com.aime.mybatis.Mapper.UserMapper;
import com.aime.mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserMapper mapper;
    @GetMapping("/all")
    public List<User> searchAll(){
        return mapper.searachAll();
    }
    @RequestMapping("/all/{id}")
    public User searchAll(@PathVariable("id") Integer id){
        return mapper.searachOne(id);
    }
}
