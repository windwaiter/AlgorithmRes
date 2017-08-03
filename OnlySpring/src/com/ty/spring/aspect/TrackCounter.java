package com.ty.spring.aspect;
//一个传参进来的自写切面 
import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackCounter {
	private Map<Integer,Integer> trackCountes=new HashMap<Integer,Integer>();
	
	@Pointcut("execution(* com.ty.spring.component.CompactDisc.play(int))&&args(trackNumber)")
	public void trackPlayed(int trackNumber){}
	
	@Before("trackPlayed(trackNumber)")
	public void countTrack(int trackNumber){
		int currentCount=getPlayCount(trackNumber);
		trackCountes.put(trackNumber,currentCount+1);
	}
	
	public int getPlayCount(int trackNumber){
		return trackCountes.containsKey(trackNumber)?trackCountes.get(trackNumber):0;
	}
	
}
