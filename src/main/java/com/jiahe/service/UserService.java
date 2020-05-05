package com.jiahe.service;

import com.jiahe.entity.User;
import org.springframework.stereotype.Service;


public interface UserService {
    public User getUserInfo();

    public String addUser(User user);
}
