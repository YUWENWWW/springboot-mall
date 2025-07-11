package com.yuwenwww.springbootmall.service;

import com.yuwenwww.springbootmall.dto.UserRegisterRequest;
import com.yuwenwww.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

}
