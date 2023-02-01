package com.collectorawas.familytree.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    /**
     * overrides the method of the same name in WebMvcConfigurer, adds four view controllers.
     */
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/family-tree/dashboard/home").setViewName("home");
        registry.addViewController("/family-tree/dashboard/").setViewName("home");
        registry.addViewController("/family-tree/dashboard/hello").setViewName("hello");
        registry.addViewController("/family-tree/dashboard/login").setViewName("login");
    }
}
