package com.ascenthr.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wlcm")
public class WelcomeRestController {
@GetMapping("/show")
    public ResponseEntity<String> showMsg(String msg)
    {
         msg="Welcome to Spring boot Applications";
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }
}
