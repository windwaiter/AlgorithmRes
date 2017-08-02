package com.ty.spring.component;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SgtPappers implements CompactDisc{

	private String title="wozhishiyigezilei";
	private String artist="woyoushiyigeshuxing";
	
//	@Bean(name="cd")
	public CompactDisc sgtPeppers(){
		return new SgtPappers();
	}
	
     public void play() {
		System.out.println(""+title+artist+"");
	}

}
