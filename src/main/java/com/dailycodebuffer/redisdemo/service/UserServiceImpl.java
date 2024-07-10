package com.dailycodebuffer.redisdemo.service;

import com.dailycodebuffer.redisdemo.model.User;
import com.dailycodebuffer.redisdemo.repository.UserDao;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Override
    public boolean saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public List<User> fetchAllUsers() {
        return userDao.fetchAllUsers();
    }

    @Override
    public User fetchUserById(Long id) {
        return userDao.findUserById(id).get();
    }
}
