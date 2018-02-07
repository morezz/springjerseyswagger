package com.groza;

import com.groza.filter.HelloWorldFilter;
import com.groza.resource.HelloWorldResource;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * JerseyConfig
 *
 * @author <a href="mailto:gzlin@coremail.cn">More</a>.
 */
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        //resource
        register(HelloWorldResource.class);

        //filter
        register(HelloWorldFilter.class);

        //swagger
        // 配置Swagger
        this.register(ApiListingResource.class);
        this.register(SwaggerSerializers.class);
    }

}
