package com.example.dockerdemo.Controller;

import com.example.dockerdemo.entity.User;
import com.example.dockerdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserRepository repository;
    @PostMapping("/user")
    public String addUser(@RequestBody User user){
        repository.save(user);
        return "User Added Successfully";
    }
    @GetMapping("/user")
    public List<User> getUsers(){
        return repository.findAll();
    }



}
