package com.oak.bookyourshelf.entity;

import lombok.Data;

@Data
public class PasswordChange {

    private String newPassword;
    private String confirmPassword;
    private String token;

    public PasswordChange() {
    }
}
