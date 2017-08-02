package com.ty.spring.test;
//classpath是编译后的classes路径，../则是上一级目录
import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ty.spring.component.CompactDisc;
import com.ty.spring.component.JuYaLing;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:com/resource/java-config.xml")
public class XmlConfigTest {

	@Inject
	private CompactDisc cd; 
	
	@Autowired
	private JuYaLing jyl;
	
	@Test
	public void cdShouldNotBeNull(){
		assertNotNull(cd);
		cd.play();
	}
}
