package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import com.example.demo.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    RedisUtil redisUtil;


    @RequestMapping("/getUser")
    public String get(Model model){
        List<User> allUser = userService.findAllUser();
        model.addAttribute("allUser",allUser);
        return "user";
    }

    @RequestMapping("/redis")
    @ResponseBody
    public String redis(){
//        Object zqd = redisUtil.get("tallyCenter");
        redisUtil.del(new String[]{"zqd"});
        return "";
    }

}
