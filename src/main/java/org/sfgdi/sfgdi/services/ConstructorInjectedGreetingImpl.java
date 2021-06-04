package org.sfgdi.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("constructorInjectedGreetingImpl")
@Service
public class ConstructorInjectedGreetingImpl implements Greetings{
    @Override
    public String doGreeting() {
        return "Hello, Welcome! from Constructor";
    }
}
