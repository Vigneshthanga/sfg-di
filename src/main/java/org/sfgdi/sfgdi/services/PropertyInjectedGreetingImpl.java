package org.sfgdi.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Qualifier("propertyInjectedGreetingImpl")
@Service
public class PropertyInjectedGreetingImpl implements Greetings{
    @Override
    public String doGreeting() {
        return "Hello, Welcome! from Property";
    }
}
