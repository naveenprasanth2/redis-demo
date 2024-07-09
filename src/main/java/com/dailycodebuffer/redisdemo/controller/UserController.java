package com.dailycodebuffer.redisdemo.controller;

import com.dailycodebuffer.redisdemo.model.User;
import com.dailycodebuffer.redisdemo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/user")
    public ResponseEntity<String> saveUser(@RequestBody User user) {
        boolean result = userService.saveUser(user);
        return result ? ResponseEntity.ok("User saved successfully") :
                new ResponseEntity<>("User not saved",HttpStatus.BAD_REQUEST);
    }
}
