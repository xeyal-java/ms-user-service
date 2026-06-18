package com.example.msuserservice.controller;

import com.example.msuserservice.dto.common.UserCommonDto;
import com.example.msuserservice.dto.request.LoginRequest;
import com.example.msuserservice.dto.request.UserRequest;
import com.example.msuserservice.dto.response.UserResponse;
import com.example.msuserservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    @ResponseStatus(CREATED)
    public UserResponse register(@RequestBody UserRequest request) {
        return userService.register(request);
    }

    @GetMapping("/{id}")
    public UserResponse getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return userService.login(request);
    }

    @GetMapping("/common/{id}")
    public UserCommonDto getCommonUser(@PathVariable Long id) {
        return userService.getCommonUser(id);
    }
}
