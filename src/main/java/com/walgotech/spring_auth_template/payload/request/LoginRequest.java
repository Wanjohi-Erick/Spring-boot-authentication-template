package com.walgotech.spring_auth_template.payload.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class LoginRequest {

    @NotBlank(message = "Username or email must not be blank")
    @Email(message = "Invalid email format")
    private String username;

    @NotBlank(message = "Password must not be blank")
    private String password;

    // Constructors, getters, and setters (if needed)

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

