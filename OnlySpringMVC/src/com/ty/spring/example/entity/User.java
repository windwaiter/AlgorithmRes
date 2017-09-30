package com.ty.spring.example.entity;

/**
 * 抱歉大兄弟们，我的spring安全校验没有成功，等我造轮子吧
 */
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


@Component
public class User {
	
	private String username;

	private String password;
	
	private MultipartFile yourHeadImage;
	
	public MultipartFile getYourHeadImage() {
		return yourHeadImage;
	}
	public void setYourHeadImage(MultipartFile yourHeadImage) {
		this.yourHeadImage = yourHeadImage;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
