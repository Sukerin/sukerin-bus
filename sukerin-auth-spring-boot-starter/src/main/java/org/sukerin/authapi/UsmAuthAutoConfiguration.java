package org.sukerin.authapi;

import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.sukerin.authapi.client.AuthorizeClient;

import javax.annotation.Resource;

/**
 * @author dr
 */
@Configuration
@ConditionalOnClass({ FeignClient.class})
@EnableConfigurationProperties(UsmAuthProperties.class)
public class UsmAuthAutoConfiguration implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    @Resource
    private UsmAuthProperties usmAuthProperties;

    @Bean
    public AuthAspect authAspect(){
        return new AuthAspect();
    }
    @Bean
    public AuthorizeClient authorizeClient(){

        FeignClientBuilder feignClientBuilder=new FeignClientBuilder(applicationContext);

        return feignClientBuilder.forType(AuthorizeClient.class,usmAuthProperties.getName()).build();
    }





}
