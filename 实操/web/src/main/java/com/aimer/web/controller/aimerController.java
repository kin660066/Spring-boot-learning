package com.aimer.web.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Map;

@Controller
public class aimerController {

    @RequestMapping("/aimer")
    public String aimer(Map<String,Object> map, Model model){
        map.put("aimer","巧遇");
        model.addAttribute("aimer2","厮守");
        model.addAttribute("users", Arrays.asList("aimer1","aimer2","aimer"));
        return "aimer";
    }

    @PostMapping
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("pwd") String pwd, Map<String,Object> map,
                        HttpSession session,
                        HttpServletRequest request){
        if(!StringUtils.isEmpty(username)&&"aimer".equals(pwd)){
            session.setAttribute("username",username);
            return "redirect:/dashboard.html";
        }
        request.setAttribute("msg","error");
        return "login";

    }

    @RequestMapping("/a/{id}")
    public String aaaa(@PathVariable("id") Integer id,Model model){
        System.out.println(id);
        model.addAttribute("id",id);
        return "login";
    }
}
