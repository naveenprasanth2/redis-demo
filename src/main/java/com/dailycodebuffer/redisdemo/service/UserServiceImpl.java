package com.dailycodebuffer.redisdemo.service;

import com.dailycodebuffer.redisdemo.model.User;
import com.dailycodebuffer.redisdemo.repository.UserDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Override
    public boolean saveUser(User user) {
        return userDao.saveUser(user);
    }
}
