package com.ty.spring.component;
/**
 * @Primary和@Qualifier不能公用在一个类上，两者都可以和@Component和@Bean使用
 */
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("magic")
//@Primary
@Qualifier("superMagic")
public class NewMagic implements Magic{
	
	public void play() {
		System.out.println("我是新魔术！");
	}
	
//	@Bean("magic")
	public Magic newMagic(){
		return new NewMagic();
	}
}
