package com.aimer.web.config;

import com.aimer.web.component.MyInteceptor;
import com.aimer.web.component.MyLocateResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration

public class myconfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/dashboard.html").setViewName("Dashboard");
    }

       @Override
    public void addInterceptors(InterceptorRegistry registry) {
       // registry.addInterceptor(new MyInteceptor()).addPathPatterns("/**").excludePathPatterns("/login.html","/","/login");
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocateResolver();
    }
}
