package org.shop.configuration;

import org.shop.annotation.InjectRandomIntAnnotationBeanPostProcessor;
import org.shop.common.Sellers;
import org.shop.annotation.MyClass;
import org.shop.logging.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class AdditionalBeansConfig {

    @Bean
    public Map<Long, String> mapSellerNames() {
        Map<Long, String> mapSellerNames = new HashMap<>();
        mapSellerNames.put(1L, Sellers.AMAZON);
        mapSellerNames.put(2L, Sellers.SAMSUNG);
        return mapSellerNames;
    }

    @Bean
    public InjectRandomIntAnnotationBeanPostProcessor injectRandomIntAnnotationBeanPostProcessor(){
        InjectRandomIntAnnotationBeanPostProcessor injectRandomIntAnnotationBeanPostProcessor = new InjectRandomIntAnnotationBeanPostProcessor();
        return  injectRandomIntAnnotationBeanPostProcessor;
    }

    @Bean("quoterBean")
    public MyClass quoter(){
        return new MyClass();
    }

    @Bean("logaspect")
    public LoggingAspect loggingAspect(){
        LoggingAspect loggingAspect = new LoggingAspect();
        return  loggingAspect;
    }


}
