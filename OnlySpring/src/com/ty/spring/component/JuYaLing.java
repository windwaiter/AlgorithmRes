package com.ty.spring.component;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("jyl")
@Qualifier("jyl")
public class JuYaLing {
	private int i;
	private String s;
	public JuYaLing( int i,String s){
//		public JuYaLing(@Value("${s.i}") int i,@Value("${s.s}")String s){
		this.i=i;
		this.s=s;
		System.out.println(s+i);
	}
	
	
}
