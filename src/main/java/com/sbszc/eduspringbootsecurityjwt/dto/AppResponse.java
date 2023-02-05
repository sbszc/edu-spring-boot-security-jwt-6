package com.sbszc.eduspringbootsecurityjwt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AppResponse {
    private String jwt;
}