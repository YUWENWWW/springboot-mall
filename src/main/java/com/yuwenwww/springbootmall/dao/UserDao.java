package com.yuwenwww.springbootmall.dao;

import com.yuwenwww.springbootmall.dto.UserRegisterRequest;
import com.yuwenwww.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
