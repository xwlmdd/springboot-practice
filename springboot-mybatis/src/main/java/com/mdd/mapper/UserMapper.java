package com.mdd.mapper;

import com.mdd.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by mdd on 2018/3/1.
 */
public interface UserMapper {

    User getUserInfoById(@Param("id")int id);
}
