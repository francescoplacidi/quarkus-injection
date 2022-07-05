package it.fra.test.service;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.arc.lookup.LookupIfProperty;

@LookupIfProperty(name = "application.service.greeter", stringValue = "nice")
@ApplicationScoped
public class NiceGreeter implements Greeter {

    @Override
    public String message() {
        return "dear";
    }
    
}
