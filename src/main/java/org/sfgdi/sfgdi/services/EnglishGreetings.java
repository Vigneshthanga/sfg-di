package org.sfgdi.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nService")
public class EnglishGreetings implements Greetings {
    @Override
    public String doGreeting() {
        return "Hello, World!";
    }
}
