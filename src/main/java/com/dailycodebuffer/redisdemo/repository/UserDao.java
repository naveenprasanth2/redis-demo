package com.dailycodebuffer.redisdemo.repository;

import com.dailycodebuffer.redisdemo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    boolean saveUser(User user);

    List<User> fetchAllUsers();

    Optional<User> findUserById(Long id);

    Optional<User> findUserByFirstName(String firstName);
}
