package com.demo.jullia.springApp.service;

import com.demo.jullia.springApp.dao.User;
import com.demo.jullia.springApp.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;
    private int x;

    public void save(String email, String password){
        userDao.save(email,password);
    }

    public List<User> getUsersByEmail(String email){
       return userDao.findByEmail(email);
    }
}
