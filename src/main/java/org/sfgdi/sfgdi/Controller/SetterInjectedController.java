package org.sfgdi.sfgdi.Controller;

import org.sfgdi.sfgdi.services.Greetings;
import org.sfgdi.sfgdi.services.PropertyInjectedGreetingImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private Greetings greetings;
    @Autowired
    public void setGreetingImpl(@Qualifier("setterInjectedGreetingImpl") Greetings greetings) {
        this.greetings = greetings;
    }

    public String getGreeting() {
        return greetings.doGreeting();
    }
}
