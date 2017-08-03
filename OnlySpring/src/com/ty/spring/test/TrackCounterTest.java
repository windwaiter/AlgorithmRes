package com.ty.spring.test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ty.spring.aspect.TrackCounter;
import com.ty.spring.component.CompactDisc;
import com.ty.spring.config.TrackCounterConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={TrackCounterConfig.class})
public class TrackCounterTest {
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private TrackCounter counter;
	
	@Test
	public void testTrackCounter(){
		cd.play(1);
//		cd.play(2);
//		cd.play(3);
//		cd.play(3);
//		cd.play(3);
//		cd.play(3);
//		cd.play(7);
		
		assertEquals(1, counter.getPlayCount(1));
//		assertEquals(1, counter.getPlayCount(2));
//		assertEquals(3, counter.getPlayCount(3));
//		assertEquals(4, counter.getPlayCount(3));
//		assertEquals(5, counter.getPlayCount(3));
//		assertEquals(6, counter.getPlayCount(6));
//		assertEquals(7, counter.getPlayCount(7));
		
	}
}
