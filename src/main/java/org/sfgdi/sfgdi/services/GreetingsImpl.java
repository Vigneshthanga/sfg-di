package org.sfgdi.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingsImpl implements Greetings{
    @Override
    public String doGreeting() {
        return "Hello, Welcome! - from primary";
    }
}
