package com.microservice.SpringEvent.handler;

import com.microservice.SpringEvent.event.CookEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class CookingFoodServiceHandler {

    @EventListener
    //@Order(2)
    @Async
    public void cookWithMicroOven(CookEvent cookEvent){
        System.out.println("Cooked the food with micro oven");
    }
}
