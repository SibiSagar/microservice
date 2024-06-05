package com.microservice.SpringEvent.handler;

import com.microservice.SpringEvent.event.CookEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class ServerService {
    @EventListener
    //@Order(4)
    @Async
    public void serve(CookEvent cookEvent){
        System.out.println("Food is given to the server");
    }
}
