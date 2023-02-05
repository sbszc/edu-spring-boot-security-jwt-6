package com.sbszc.eduspringbootsecurityjwt6;

import com.sbszc.eduspringbootsecurityjwt6.security.JwtUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EduSpringBootSecurityJwt6ApplicationTests {

    @Autowired
    JwtUtil jwtUtil;

    @Test
    void contextLoads() {
        System.out.println(jwtUtil.EXPIRATION_MILLIS);
    }

}
