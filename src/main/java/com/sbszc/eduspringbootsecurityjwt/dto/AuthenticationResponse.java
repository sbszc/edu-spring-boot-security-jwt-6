package com.sbszc.eduspringbootsecurityjwt.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class AuthenticationResponse implements Serializable {
	private final String jwt;
}