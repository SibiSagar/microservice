package com.microservice.SpringEvent.handler;


import com.microservice.SpringEvent.event.CookEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class IngredientsServiceHandler {

    @EventListener
    //@Order(1)
    @Async
    public void prepareIngredients(CookEvent cookEvent){
        System.out.println("Gathered and Ingredients are made ready for the required Food");
    }
}
