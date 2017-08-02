package com.ty.spring.test;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ty.spring.component.Performance;
import com.ty.spring.config.AspectjConditionTest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AspectjConditionTest.class})
public class AspectJTest {
	
	@Autowired
	private Performance newPerformance;
	
	@Test
	public void perform(){
		newPerformance.perform();
	}
}
