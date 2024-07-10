package com.dailycodebuffer.redisdemo.controller;

import com.dailycodebuffer.redisdemo.model.User;
import com.dailycodebuffer.redisdemo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<String> saveUser(@RequestBody User user) {
        boolean result = userService.saveUser(user);
        return result ? ResponseEntity.ok("User saved successfully") :
                new ResponseEntity<>("User not saved",HttpStatus.BAD_REQUEST);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(userService.fetchAllUsers(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<User> getUserById(@RequestParam("id") Long id) {
        return new ResponseEntity<>(userService.fetchUserById(id), HttpStatus.OK);
    }
}
