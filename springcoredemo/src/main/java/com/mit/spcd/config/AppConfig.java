package com.mit.spcd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mit.spcd.beans.Address;
import com.mit.spcd.beans.Person;

@Configuration
@ComponentScan(basePackages="com.mit.spcd.beans")
public class AppConfig {
         
//	@BeanAppConfig.java
//	public Address address()
//	{
//		return new Address("7-7-9","sarojnin ngar","delhi","delhi");
//	}
//	
//	@Bean
//	public Person person()
//	{
//		Person p = new Person();
//		p.setSsn(101);
//		p.setName("ajay saxena");
//		p.setAge(22);
//		
//	   return p;
//	}
	
	 
}
