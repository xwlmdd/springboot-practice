package com.mdd.domain;

import lombok.*;

import java.util.Date;

/**
 * Created by mdd on 2018/3/1.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String userName;
    private String password;
    private String phone;
    private String email;
    private String qq;
    private String weixin;
    private int type;
    private Date createTime;
}
