package com.dailycodebuffer.redisdemo.repository;

import com.dailycodebuffer.redisdemo.model.User;

public interface UserDao {
    boolean saveUser(User user);
}
