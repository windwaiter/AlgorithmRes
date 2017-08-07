package com.ty.test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import com.ty.spring.example.controller.LoginController;

public class LoginTest {

	@Test
	public void loginTest() throws Exception {
		LoginController loginController=new LoginController(); 
		
		MockMvc mockMvc=standaloneSetup(loginController).build();
		
		 mockMvc.perform(get("/login/loginindex?username=ty&password=123")).andExpect(view().name("login"));
//		 mockMvc.perform(get("/login")).andExpect(view().name("login"));
	}
}
