package com.example.demo.controller;

import com.example.demo.common.CodeEnum;
import com.example.demo.common.JsonResult;
import com.example.demo.exception.UserNotExistException;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import com.example.demo.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
    public String get(Model model,String name,String phone){
        int pageNum = 1;
        int pageSize = 6;
        List<User> allUser = userService.findAllUser(pageNum,pageSize,name,phone);

        if(allUser.isEmpty()){
            throw new UserNotExistException("没有获取到【"+name+"】的用户信息");
        }
        model.addAttribute("allUser",allUser);
        return "user";
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public JsonResult getuser(String name,String phone){
        int pageNum = 1;
        int pageSize = 6;
        List<User> allUser = userService.findAllUser(pageNum,pageSize,name,phone);
        JsonResult jsonResult = new JsonResult();


        if(allUser.isEmpty()){
            jsonResult.setCode(CodeEnum.FAIL);
            jsonResult.setMessage("获取信息失败");
//            throw new UserNotExistException("没有获取到【"+name+"】的用户信息");
        }else{
            jsonResult.setCode(CodeEnum.SUCCESS);
            jsonResult.setMessage("获取信息成功");
            jsonResult.setData(allUser);
        }
        return jsonResult;
    }


    @RequestMapping("/redis")
    @ResponseBody
    public String redis(){

        redisUtil.del(new String[]{"zqd"});
        return "";
    }
    @Value("${spring.profiles.active}")
    private String active;

    @RequestMapping("/getActive")
    @ResponseBody
    public String active(){

        return active;
    }

}
