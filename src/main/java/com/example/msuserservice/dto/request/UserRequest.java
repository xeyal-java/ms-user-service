package com.example.msuserservice.dto.request;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserRequest {

    @Email(message = "Invalid email format")
    private String email;

    @NotNull(message = "Username cannot be empty")
    private String username;
    private String password;
    private String fullName;
}
