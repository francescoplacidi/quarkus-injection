package it.fra.test;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import it.fra.test.service.Greeter;

@Path("/hello")
public class GreetingResource {

    @Inject
    Instance<Greeter> greeter;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return String.format("Hello %s", greeter.get().message());
    }
}