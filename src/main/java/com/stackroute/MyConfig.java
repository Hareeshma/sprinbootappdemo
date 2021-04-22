package com.stackroute;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.stackroute"})   //allow spring to know the package to be scanned
public class MyConfig {
    //use components
    @Bean
    public Movie movie(){
        return new Movie();
    }
    @Bean
    public Actor actor(){
        return new Actor();
    }


}
