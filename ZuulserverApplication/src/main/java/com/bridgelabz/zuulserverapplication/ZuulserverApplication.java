package com.bridgelabz.zuulserverapplication;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
//import org.springframework.context.annotation.Bean;
//import com.bridgelabz.zuulserverapplication.filters.ZuulErrorFilter;
//import com.bridgelabz.zuulserverapplication.filters.ZuulPostFilter;
//import com.bridgelabz.zuulserverapplication.filters.ZuulPreFilter;
//import com.bridgelabz.zuulserverapplication.filters.ZuulRouterFilter;
@SpringBootApplication
@EnableEurekaClient 
@EnableDiscoveryClient
@EnableZuulProxy
//@EnableAutoConfiguration
public class ZuulserverApplication
{
   public static void main(String[] args) {
      SpringApplication.run(ZuulserverApplication.class, args);
   }
//      
//     @Bean
//  	public ZuulPreFilter zuulPreFilter()
//  	{
//  		return new ZuulPreFilter();
//  	}
//  	@Bean
//  	public ZuulPostFilter zuulpostFilter()
//  	{
//  		return new ZuulPostFilter();
//  	}
//  	@Bean
//  	public ZuulErrorFilter zuulerrorFilter()
//  	{
//  		return new ZuulErrorFilter();
//  	}
//  	@Bean
//  	public ZuulRouterFilter zuulrouterFilter()
//  	{
//  		return new ZuulRouterFilter();
//  	}

}
