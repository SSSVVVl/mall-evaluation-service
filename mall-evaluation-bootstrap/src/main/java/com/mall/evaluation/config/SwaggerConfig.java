package com.mall.evaluation.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Swagger 配置
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("商城评价服务 API")
                        .description("商城评价服务接口文档")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Mall Team")
                                .email("mall@example.com")));
    }
}