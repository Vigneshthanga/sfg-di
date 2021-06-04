package org.sfgdi.sfgdi.Controller;

import org.sfgdi.sfgdi.services.Greetings;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {
    Greetings greetings;

    public I18NController(@Qualifier("i18nService") Greetings greetings) {
        this.greetings = greetings;
    }

    public String getGreetings() {
        return greetings.doGreeting();
    }
}
