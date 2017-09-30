package com.ty.spring.example.controller;

import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.ty.spring.example.entity.User;
import com.ty.spring.example.exception.FileTestException;

@Controller
public class FileController {
	
	@RequestMapping("/file")
	public void doFile(HttpServletRequest request,HttpServletResponse reponse,User user,@RequestPart("yourHeadImage") MultipartFile yourHeadImage)throws Exception{
		System.out.println("过滤器放过我了，我见到了我的挚爱！");
		InputStream fileIo;
		fileIo = yourHeadImage.getInputStream();
		throw new FileTestException();
	}
	
}
