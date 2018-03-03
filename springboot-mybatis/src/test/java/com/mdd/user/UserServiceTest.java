package com.mdd.user;

import com.mdd.SpringbootMybatisApplicationTests;
import com.mdd.domain.User;
import com.mdd.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by mdd on 2018/3/3.
 */
@Slf4j
public class UserServiceTest extends SpringbootMybatisApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void testSaveUserInfo(){
        User user = User.builder().userName("毛豆豆")
                .password("123456")
                .email("1072552712@qq.com")
                .phone("123456789")
                .qq("1072552712")
                .type(1)
                .weixin("123456")
                .build();
        int i = userService.saveUserInfo(user);
        System.out.println(i);
    }

    @Test
    public void testUpdateUserInfo(){
        User user = User.builder()
                .id(2)
                .userName("毛豆豆")
                .password("123")
                .email("1072552712@qq.com")
                .phone("1111111")
                .weixin("wwww")
                .build();
        int i = userService.saveUserInfo(user);
        System.out.println(i);
    }
}
