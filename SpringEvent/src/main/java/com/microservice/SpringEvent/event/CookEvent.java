package com.microservice.SpringEvent.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class CookEvent extends ApplicationEvent {

    public CookEvent(Object source){
        super(source);
    }
}
