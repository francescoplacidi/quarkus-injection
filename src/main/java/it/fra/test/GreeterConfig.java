package it.fra.test;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

import io.quarkus.arc.DefaultBean;
import io.quarkus.arc.properties.IfBuildProperty;
import it.fra.test.service.FormalGreeter;
import it.fra.test.service.Greeter;
import it.fra.test.service.NiceGreeter;

@Dependent
public class GreeterConfig {

    @Produces
    @IfBuildProperty(name = "application.service.greeter", stringValue = "formal")
    public Greeter formalGreeter() {
        return new FormalGreeter();
    }

    @Produces
    @DefaultBean
    @IfBuildProperty(name = "application.service.greeter", stringValue = "nice")
    public Greeter niceGreeter() {
        return new NiceGreeter();
    }

}
