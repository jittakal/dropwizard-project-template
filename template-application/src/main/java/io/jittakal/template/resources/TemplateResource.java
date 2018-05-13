package io.jittakal.template.resources;

import com.codahale.metrics.annotation.Timed;
import io.jittakal.template.response.ResponseMessage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Optional;

@Path("/template")
@Produces(MediaType.APPLICATION_JSON)
public class TemplateResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    public TemplateResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public ResponseMessage sayHello(@QueryParam("name") Optional<String> name) {
        final String value = String.format(template, name.orElse(defaultName));
        return new ResponseMessage(counter.incrementAndGet(), value);
    }
}