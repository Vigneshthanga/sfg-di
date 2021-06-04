package org.sfgdi.sfgdi.Controller;

import org.sfgdi.sfgdi.services.Greetings;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController {
    private final Greetings greetings;

    public PrimaryController(Greetings greetings) {
        this.greetings = greetings;
    }

    public String getGreeting() {
        return greetings.doGreeting();
    }
}
