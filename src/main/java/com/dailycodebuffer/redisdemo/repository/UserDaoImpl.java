package com.dailycodebuffer.redisdemo.repository;

import com.dailycodebuffer.redisdemo.model.User;
import lombok.AllArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class UserDaoImpl implements UserDao {
    private final RedisTemplate redisTemplate;
    private static final String KEY = "USER";

    @Override
    public boolean saveUser(User user) {
        try {
            redisTemplate.opsForHash().put(KEY, user.getId().toString(), user.toString());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<User> fetchAllUsers() {
        return redisTemplate.opsForHash().values(KEY);
    }

    @Override
    public Optional<User> findUserById(Long id) {
        return Optional.of((User) redisTemplate.opsForHash().get(KEY, id.toString()));
    }

    @Override
    public Optional<User> findUserByFirstName(String firstName) {
        return Optional.empty();
    }


}
