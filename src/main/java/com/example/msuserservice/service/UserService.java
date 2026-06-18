package com.example.msuserservice.service;


import com.example.msuserservice.dto.common.UserCommonDto;
import com.example.msuserservice.dto.request.LoginRequest;
import com.example.msuserservice.dto.request.UserRequest;
import com.example.msuserservice.dto.response.UserResponse;

public interface UserService {
    UserResponse register(UserRequest request);
    UserResponse getUserById(Long id);
    String login(LoginRequest request);
    UserCommonDto getCommonUser(Long id);
}
