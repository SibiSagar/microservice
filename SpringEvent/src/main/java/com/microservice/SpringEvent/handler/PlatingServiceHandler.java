package com.microservice.SpringEvent.handler;

import com.microservice.SpringEvent.event.CookEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class PlatingServiceHandler {

    @EventListener
    //@Order(3)
    @Async
    public void decoration(CookEvent cookEvent){
        System.out.println("Food plating is done with innovation");
    }
}
