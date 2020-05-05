package com.jiahe.service.impl;

import com.jiahe.entity.User;
import com.jiahe.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUserInfo() {
        return null;
    }

    @Override
    public String addUser(User user) {
        return "success";
    }
}
