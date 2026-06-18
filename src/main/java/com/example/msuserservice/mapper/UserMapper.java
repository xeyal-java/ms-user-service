package com.example.msuserservice.mapper;

import com.example.msuserservice.dto.request.UserRequest;
import com.example.msuserservice.dto.response.UserResponse;
import com.example.msuserservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User toEntity(UserRequest request);

    UserResponse toResponse(User user);
}
