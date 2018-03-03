package com.mdd.dao.impl;

import com.mdd.dao.UserDao;
import com.mdd.domain.User;
import com.mdd.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by mdd on 2018/3/1.
 */
@Component
public class UserDaoImpl implements UserDao{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserDaoById(int id) {
        return userMapper.getUserInfoById(id);
    }

    @Override
    public int saveUserInfo(User user) {
        return userMapper.saveUserInfo(user);
    }
}
