package com.railway.project.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void register(String userName, String password) {
        // it's only mocking without the business logic for demo
        System.out.println("registerting user with name: " + userName);
    }
}