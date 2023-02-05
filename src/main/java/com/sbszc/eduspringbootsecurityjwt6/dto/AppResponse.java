package com.sbszc.eduspringbootsecurityjwt6.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AppResponse {
    private String jwt;
}