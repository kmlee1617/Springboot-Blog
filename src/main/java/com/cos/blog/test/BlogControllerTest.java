package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;

public class BlogControllerTest {
    
    @GetMapping("/test/hello")
    public String hello() {
        return "<h1> hello spring boot </h1>";
    }
}
