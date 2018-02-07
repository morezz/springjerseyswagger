package com.groza;

import io.swagger.jaxrs.config.BeanConfig;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Swagger2
 *
 * @author <a href="mailto:gzlin@coremail.cn">More</a>.
 */

@Component
public class Swagger2Config {

    @PostConstruct
    public void initSwagger() {
        BeanConfig config = new BeanConfig();
        config.setTitle("MMS");
        config.setDescription("my microservice seed");
        config.setVersion("1.0.0");
        config.setContact("Groza");
        config.setSchemes(new String[] {"http", "https"});
        config.setBasePath("/jersey");
        config.setResourcePackage("com.groza.resource");
        config.setPrettyPrint(true);
        config.setScan(true);
    }

 
//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .useDefaultResponseMessages(false).globalResponseMessage(RequestMethod.GET,
//                        Arrays.asList(new ResponseMessageBuilder()
//                                        .code(500)
//                                        .message("500 message")
//                                        .responseModel(new ModelRef("Error"))
//                                        .build(),
//                                new ResponseMessageBuilder()
//                                        .code(403)
//                                        .message("Forbidden!")
//                                        .build()))
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.groza.resource"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("Spring Boot中使用Swagger2构建RESTful APIs")
//                .description("更多Spring Boot")
//                .termsOfServiceUrl("http://www.baidu.com")
//                .contact(new Contact("groza", "http://www.baidu.com", "gzlin@coremail.cn"))
//                .version("2.0")
//                .build();
//    }
}
