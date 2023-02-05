package com.sbszc.eduspringbootsecurityjwt6.controller;

import com.sbszc.eduspringbootsecurityjwt6.dto.AppRequest;
import com.sbszc.eduspringbootsecurityjwt6.dto.AppResponse;
import com.sbszc.eduspringbootsecurityjwt6.security.JwtUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    public AppController(AuthenticationManager authenticationManager,
                         JwtUtil jwtUtil) {
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
    }

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("authenticate")
    public ResponseEntity<AppResponse> createAuthenticationToken(@RequestBody AppRequest req) throws Exception {
        Authentication auth = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(req.getUsername(), req.getPassword())
        );

        if (!auth.isAuthenticated()) {
            throw new UsernameNotFoundException("bad username or password");
        }

        final String jwt = jwtUtil.generateToken((UserDetails) auth.getPrincipal());

        return ResponseEntity.ok(new AppResponse(jwt));
    }
}
