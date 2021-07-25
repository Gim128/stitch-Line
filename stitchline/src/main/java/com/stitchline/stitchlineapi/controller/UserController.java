package com.stitchline.stitchlineapi.controller;

import com.stitchline.stitchlineapi.model.User;
import com.stitchline.stitchlineapi.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stichline")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity addUser(@RequestBody User user){
        userService.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @PutMapping
    public ResponseEntity updateUser(@RequestBody User user){
        userService.updateUser(user);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable String id){
        userService.deleteUser(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity searchUser(@PathVariable String id){
        return ResponseEntity.ok(userService.searchUser(id));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAlluser() {
        return ResponseEntity.ok(userService.getAllUser());
    }
}
