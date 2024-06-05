package com.microservice.SpringEvent.Controller;


import com.microservice.SpringEvent.model.CookRequest;
import com.microservice.SpringEvent.service.CookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cook")
public class CookingController {

    @Autowired
    private CookService cookService;


    @PostMapping
    public void cookFood(@RequestBody CookRequest cookRequest){

        this.cookService.cookFood(cookRequest);

    }

}
