package com.example.jpademo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserRespository userRespository;

    public UserService(UserRespository userRespository) {
        this.userRespository = userRespository;
    }

    public UserClassSpringBoot createUser(UserClassSpringBoot user) {
        return userRespository.save(user);
    }

    public List<UserClassSpringBoot> getAllUsers() {
        return userRespository.findAll();
    }
}
