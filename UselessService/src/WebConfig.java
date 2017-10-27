package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@EnableWebMvc
@Configuration
@ComponentScan(basePackageClasses={WebConfig.class})
public class WebConfig extends WebMvcConfigurerAdapter{
   @Override
   public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
       System.out.println("****configureMessageConverters");
       super.configureMessageConverters(converters);
       converters.add(new CustomMessageConverter());
   }
}
