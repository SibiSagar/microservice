package com.microservice.PasswordService.controller;


import com.microservice.PasswordService.model.DecryptPassword;
import com.microservice.PasswordService.model.PasswordRequest;
import com.microservice.PasswordService.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/password")
public class PasswordController {
    @Autowired
    private PasswordService passwordService;

    @PostMapping("/encrypt")
    public String encrypt(@RequestBody PasswordRequest passwordRequest){

        return passwordService.encrypt(passwordRequest);
    }

    @PostMapping("/decrypt")
    public String dencrypt(@RequestBody DecryptPassword decryptPassword){

        return passwordService.decrypt(decryptPassword);
    }
}
