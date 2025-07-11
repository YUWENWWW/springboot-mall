package com.yuwenwww.springbootmall.dao;

import com.yuwenwww.springbootmall.dto.UserRegisterRequest;
import com.yuwenwww.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
