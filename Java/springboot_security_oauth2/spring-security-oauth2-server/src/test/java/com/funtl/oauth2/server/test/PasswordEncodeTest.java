package com.funtl.oauth2.server.test;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncodeTest {

    @Test
    public void test(){
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }

    @Test
    public void test2(){
//        System.out.println(AESUtils.);
    }
}
