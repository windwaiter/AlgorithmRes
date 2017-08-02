package com.ty.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ty.spring.component.Magic;
import com.ty.spring.component.NewMagic;

@Configuration
@ComponentScan("com.ty.spring.component")
public class SuperMagicConfig {

}
