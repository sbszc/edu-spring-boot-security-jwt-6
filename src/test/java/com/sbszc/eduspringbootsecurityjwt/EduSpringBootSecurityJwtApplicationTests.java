package com.sbszc.eduspringbootsecurityjwt;

import com.sbszc.eduspringbootsecurityjwt.security.JwtUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EduSpringBootSecurityJwtApplicationTests {

    @Autowired
    JwtUtil jwtUtil;

    @Test
    void contextLoads() {
        System.out.println(jwtUtil.EXPIRATION_MILLIS);
    }

}
