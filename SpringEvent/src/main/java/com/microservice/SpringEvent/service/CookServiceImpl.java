package com.microservice.SpringEvent.service;


import com.microservice.SpringEvent.event.CookEvent;
import com.microservice.SpringEvent.handler.IngredientsServiceHandler;
import com.microservice.SpringEvent.model.CookRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class CookServiceImpl implements CookService {

    @Autowired
    private CookEvent cookEvent;
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    //EventPublisher
    @Override
    public void cookFood(CookRequest cookRequest) {
        log.info("Started Cooking...");

        //Event published here
        this.applicationEventPublisher.publishEvent(cookEvent);

        log.info("Food served");
    }
}
