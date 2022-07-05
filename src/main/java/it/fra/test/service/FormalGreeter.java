package it.fra.test.service;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.arc.lookup.LookupIfProperty;

@LookupIfProperty(name = "application.service.greeter", stringValue = "formal")
@ApplicationScoped
public class FormalGreeter implements Greeter {
    @Override
    public String message() {
        return "doctor";
    }
}
