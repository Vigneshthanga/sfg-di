package org.sfgdi.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Qualifier("setterInjectedGreetingImpl")
@Service
public class SetterInjectedGreetingImpl implements Greetings{
    @Override
    public String doGreeting() {
        return "Hello, Welcome! from Setter";
    }
}
