package com.ty.spring.component;
//component和autowired配合使用将会极大的降低耦合，如需参透请动手实现此代码
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SuperMagic {
	
	private Magic magic;
	
	@Autowired
	public SuperMagic(Magic magic){
		this.magic=magic;
	}
	
    public void play(){
    	magic.play();
    }
    
}
