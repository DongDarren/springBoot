package com.example.demo.service;


import com.example.demo.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser(int pageNum,int pageSize,String name,String phone);
}
