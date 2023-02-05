package com.sbszc.eduspringbootsecurityjwt6.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AppRequest {
    private String username;
    private String password;
}