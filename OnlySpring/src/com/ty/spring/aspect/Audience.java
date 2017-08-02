package com.ty.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
/**
 * 
 * @author Ty
 *
 *当切点得到调用时，也就是执行方法的调用时，spring的自动代理会拦截此调用，然后调用EnableAspectJAutoProxy生成代理对象。
 */
@Aspect
public class Audience {

	//普通切面的写法
	/*@Before("execution(** com.ty.spring.component.Performance.perform(..))")
	public void silenceCellPhone(){
		System.out.println("Silence cell phones");
	}
	
	@Before("execution(** com.ty.spring.component.Performance.perform(..))")
	public void takeSeats(){
		System.out.println("Take Seats");
	}
	
	@AfterReturning("execution(** com.ty.spring.component.Performance.perform(..))")
	public void appluse(){
		System.out.println("CLAP CLAP CLAP...");
	}
	
	@AfterThrowing("execution(** com.ty.spring.component.Performance.perform(..))")
	public void demandRefund(){
		System.out.println("Demanding a refund");*/
	
	//拥有@Pointcut切面的写法
//	@Pointcut("execution (** com.ty.spring.component.Performance.perform(..))")
//	public void performence(){}
//	
//		@Before("performence()")
//		public void silenceCellPhone(){
//			System.out.println("Silence cell phones");
//		}
//		
//		@Before("performence()")
//		public void takeSeats(){
//			System.out.println("Take Seats");
//		}
//		
//		@AfterReturning("performence()")
//		public void appluse(){
//			System.out.println("CLAP CLAP CLAP...");
//		}
//		
//		@AfterThrowing("performence()")
//		public void demandRefund(){
//			System.out.println("Demanding a refund");
//		}
	@Pointcut("execution (** com.ty.spring.component.Performance.perform(..))")
	public void performence(){}
	
	@Around("performence()")
	public void watchPerformence(ProceedingJoinPoint jp){
		try {
			System.out.println("Silence cell phones");
			System.out.println("Take Seats");
			jp.proceed();
			System.out.println("Take Seats");
		} catch (Throwable e) {
			System.out.println("Demanding a refund");
		}
	}
}
