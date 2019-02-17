package com.demo1.service.impl;

import com.demo1.service.IUserService;

public class UserServiceImpl implements IUserService {
    @Override
    public void sayHello(String str) {
        System.out.println("Hello " + str + "...");
    }
}
