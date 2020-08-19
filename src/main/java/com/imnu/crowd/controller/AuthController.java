package com.imnu.crowd.controller;

import com.imnu.crowd.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AuthController {

    @Autowired
    private AuthService authService;
}
