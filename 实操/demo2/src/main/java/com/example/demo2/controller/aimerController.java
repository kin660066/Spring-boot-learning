package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
