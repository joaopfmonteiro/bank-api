package com.joao.bankbackapi.business.services;

import com.joao.bankbackapi.business.persistant.UserEntity;
import com.joao.bankbackapi.business.persistant.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> findAllUsers(){
        return userRepository.findAll();
    }
    public UserEntity findUserById(Long id){
        return userRepository.getById(id);
    }
    public  UserEntity saveUser(UserEntity user){
        return userRepository.save(user);
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
//    public void updateUser(Long id){
//        return userRepository.
//    }

}
