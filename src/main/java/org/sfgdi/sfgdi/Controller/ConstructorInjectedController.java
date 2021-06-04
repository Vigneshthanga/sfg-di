package org.sfgdi.sfgdi.Controller;

import org.sfgdi.sfgdi.services.Greetings;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final Greetings greetings;
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingImpl") Greetings greetings) {
        this.greetings = greetings;
    }

    public String getGreeting() {
        return greetings.doGreeting();
    }
}
