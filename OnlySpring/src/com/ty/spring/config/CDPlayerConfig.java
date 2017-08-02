package com.ty.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import com.ty.spring.component.CompactDisc;
import com.ty.spring.component.JuYaLing;
import com.ty.spring.component.SgtPappers;


@Configuration()
@PropertySource("classpath:com/resource/jyl.properties")
public class CDPlayerConfig {
	@Autowired
	private Environment env;
	
	@Bean
	public CompactDisc sgtPappers(){
		return new SgtPappers();
	}
	//取值在外面，提高代码质量，降低耦合
	@Bean("jyl")
	@Qualifier("jyl")
	public JuYaLing jyl(){
		return new JuYaLing(Integer.parseInt(env.getProperty("s.i").toString()), env.getProperty("s.s"));
		//共有四种获值方法来获得spring的值,下面这种是当值为空，返回默认值
		// return new JuYaLing(Integer.parseInt(env.getProperty("s.i","1").toString()), env.getProperty("s.s","s"));
	}
	
//	@Bean
//	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
//		return new PropertySourcesPlaceholderConfigurer();
//	}
}
