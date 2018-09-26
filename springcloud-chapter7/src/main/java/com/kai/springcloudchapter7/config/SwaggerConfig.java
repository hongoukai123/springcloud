package com.kai.springcloudchapter7.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2配置类
 * 使用Swagger2自动创建RestFul的在线API文档
 * Configuration注解，让spring来加载这个类
 * EnableSwagger2注解，来启用Swagger2
 * @author hongok
 * @since 2018-9-12 15:25:28
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 创建Docket的Bean
     * @return
     */
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.kai.springcloudchapter7.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 用来创建该api的基本信息（这些基本信息会展现在文档页面）
     * @return
     */
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("SpringCloudChapter7构建的RestFulApi接口")
                .description("更多请访问：http://127.0.0.1:9090")
                .termsOfServiceUrl("http://blog.csdn.het/hok")
                .version("1.0")
                .build();
    }

}
