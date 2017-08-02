package com.ty.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ty.spring.component.NewPerformance;
import com.ty.spring.component.Performance;

@Configuration
@Import(AspectJConfig.class)
public class AspectjConditionTest {
	@Bean("newPerformance")
	public Performance performance(){
		return new NewPerformance();
	}
}
