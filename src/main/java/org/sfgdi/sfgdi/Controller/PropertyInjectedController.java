package org.sfgdi.sfgdi.Controller;

import org.sfgdi.sfgdi.services.Greetings;
import org.sfgdi.sfgdi.services.PropertyInjectedGreetingImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("propertyInjectedGreetingImpl")
    public Greetings greetings;

    public String getGreeting() {
        return greetings.doGreeting();
    }
}
