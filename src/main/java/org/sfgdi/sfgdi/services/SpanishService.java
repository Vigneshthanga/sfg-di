package org.sfgdi.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
//@Qualifier("i18nService")
public class SpanishService implements Greetings{
    @Override
    public String doGreeting() {
        return "Hola, Mundo!";
    }
}
