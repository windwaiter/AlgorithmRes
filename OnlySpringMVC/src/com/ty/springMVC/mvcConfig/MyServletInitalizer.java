package com.ty.springMVC.mvcConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;

public class MyServletInitalizer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		javax.servlet.FilterRegistration.Dynamic myServlet=servletContext.addFilter("myServlet", MyFilter.class);
//		myServlet.addMappingForUrlPatterns(null, false, "/");
//	}
}
