package com.stitchline.stitchlineapi.service;

import com.stitchline.stitchlineapi.model.User;
import com.stitchline.stitchlineapi.repository.UserRepository;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void addUser(User user){
        userRepository.insert(user);
    }

    public void updateUser(User user){
        User savedUser = userRepository.findById(user.getId()).orElseThrow(() -> new RuntimeException(String.format("Cannot Find User By ID %s", user.getId())));

        savedUser.setName(user.getName());
        savedUser.setEmail(user.getEmail());
        savedUser.setMobile(user.getMobile());
        savedUser.setUsername(user.getUsername());
        savedUser.setPassword(user.getPassword());

        userRepository.save(savedUser);
    }

    public User searchUser(String name){
        return userRepository.findByName(name).orElseThrow(() -> new RuntimeException(
                String.format("Cannot Find User by ID %s", name)
        ));
    }

    public void deleteUser(String id){
        userRepository.deleteById(id);
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }
}
