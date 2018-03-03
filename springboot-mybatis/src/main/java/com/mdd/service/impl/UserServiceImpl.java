package com.mdd.service.impl;

import com.mdd.dao.UserDao;
import com.mdd.domain.User;
import com.mdd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mdd on 2018/3/1.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserInfoById(int id) {
        return userDao.getUserDaoById(id);
    }

    @Override
    public int saveUserInfo(User user) {
        return userDao.saveUserInfo(user);
    }
}
