package com.joao.bankbackapi.controllers.entities;

import com.joao.bankbackapi.business.persistant.UserEntity;
import com.joao.bankbackapi.business.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping()
    public List<UserEntity> findAllUsers(){
        return userService.findAllUsers();
    }
    @GetMapping("/{id}")
    public UserEntity getUserById(@PathVariable Long id){
        return userService.findUserById(id);
    }
    @PostMapping()
    public UserEntity saveUser(@RequestBody UserEntity user){
        return userService.saveUser(user);
    }
//    @PutMapping
//    public UserEntity updateUser(@RequestBody UserEntity user){
//        return userService.up
//    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }
}
