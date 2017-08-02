package com.ty.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.ty.spring.aspect.Audience;

@Configuration
@EnableAspectJAutoProxy
public class AspectJConfig {
	@Bean
	public Audience audience(){
		return new Audience();
	}
}
