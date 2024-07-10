package com.dailycodebuffer.redisdemo.service;

import com.dailycodebuffer.redisdemo.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    boolean saveUser(User user);

    List<User> fetchAllUsers();

    User fetchUserById(Long id);
}
