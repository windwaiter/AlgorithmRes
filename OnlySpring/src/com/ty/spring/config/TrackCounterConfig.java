package com.ty.spring.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.ty.spring.aspect.TrackCounter;
import com.ty.spring.component.BlankDisc;
import com.ty.spring.component.CompactDisc;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

	@Bean
	public CompactDisc getCd(){
		BlankDisc cd=new BlankDisc();
		cd.setTitle("aaaa");
		cd.setArtist("bbbb");
		List<String> tracks=new ArrayList<String>();
		tracks.add("1");
		tracks.add("2");
		tracks.add("3");
		tracks.add("4");
		tracks.add("5");
		tracks.add("6");
		tracks.add("7");
		cd.setTracks(tracks);
		return cd;
	}
	
	@Bean
	public TrackCounter trackCounter(){
		return new TrackCounter();
	}
}
