package com.jiahe.controller;

import com.jiahe.entity.User;
import com.jiahe.service.UserService;
import com.jiahe.result.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("user")
@Api(tags = "用户接口")

public class UserController {
    @Autowired
    UserService userService;
    @ApiOperation("添加用户")
    @PostMapping("/addUser")
    public String addUser(@RequestBody @Valid User user) {
        return userService.addUser(user);
    }

    @ApiOperation("查询单个用户信息")
    @GetMapping("getUser")
    public ResponseResult getUser() {
        User user = new User();
        user.setAccount("1234567");
        user.setEmail("1551466154@qq.com");
        user.setId(1L);
        user.setPassword("12465");
        return new ResponseResult<User>(user);
    }
}
