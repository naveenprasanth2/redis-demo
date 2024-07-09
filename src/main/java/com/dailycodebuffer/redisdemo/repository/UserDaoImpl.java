package com.dailycodebuffer.redisdemo.repository;

import com.dailycodebuffer.redisdemo.model.User;
import lombok.AllArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class UserDaoImpl implements UserDao {
    private final RedisTemplate<String, Object> redisTemplate;
    private static final String KEY = "USER";

    @Override
    public boolean saveUser(User user) {
        try {
            redisTemplate.opsForHash().put(KEY, user.getId(), user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
