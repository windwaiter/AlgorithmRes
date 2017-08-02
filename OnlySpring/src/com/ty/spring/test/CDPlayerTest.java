package com.ty.spring.test;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ty.spring.component.CompactDisc;
import com.ty.spring.component.JuYaLing;
import com.ty.spring.component.Magic;
import com.ty.spring.config.CDPlayerConfig;
import com.ty.spring.config.SoundSystemConfig;

//spring装配之xml和javaconfig装配，主要是在javaconfig中
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
//	@Autowired
	@Inject
	private CompactDisc cd;
	
	@Autowired
	@Qualifier("jyl")
	private JuYaLing jyl;
	@Test
	public void cdShouldNotBeNull(){
		assertNotNull(cd);
		assertNotNull(jyl);
	}
}
