package com.springboot.dubbo.dubbo_consume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dubbo.dubbo_consume.service.impl.RefService;

/**
 * Hello world!
 *
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan  
@RestController
public class ApplicationConsume 
{
	@Autowired  
    private RefService refService;  
      
    public static void main(String[] args) {  
        SpringApplication.run(ApplicationConsume.class, args);  
    }  
      
    @RequestMapping("/say")  
    public String sayHello(String name) {  
        return refService.sayHello(name);  
    }
}
