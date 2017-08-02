package com.ty.spring.test;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ty.spring.component.Magic;
import com.ty.spring.component.NewMagic;
import com.ty.spring.component.SuperMagic;
import com.ty.spring.config.SuperMagicConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={SuperMagicConfig.class})
public class MagicTest {

	@Autowired
	private SuperMagic superMagic;
	
	@Test
	public void shout(){
		assertNotNull(superMagic);
		superMagic.play();
	}
}
