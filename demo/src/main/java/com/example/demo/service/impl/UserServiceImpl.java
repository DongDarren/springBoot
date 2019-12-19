package com.example.demo.service.impl;
import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAllUser(int pageNum,int pageSize,String name,String phone) {
        PageHelper.startPage(pageNum,pageSize);
        return userMapper.findAllUser(name,phone);
    }
}
