package io.jittakal.template;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.jittakal.template.health.TemplateHealthCheck;
import io.jittakal.template.resources.TemplateResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplateApplication extends Application<TemplateConfiguration> {

    private static final Logger LOG = LoggerFactory.getLogger(TemplateApplication.class);

    public static void main(String[] args) throws Exception {
        new TemplateApplication().run(args);
    }

    @Override
    public String getName() {
        return "template";
    }

    @Override
    public void initialize(Bootstrap<TemplateConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(TemplateConfiguration configuration,
                    Environment environment) {
        final TemplateResource resource = new TemplateResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );
        final TemplateHealthCheck healthCheck =
                new TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
    }
}
