package com.java.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class WebSecurityConfig extends AbstractSecurityWebApplicationInitializer{
	
	public WebSecurityConfig() {
		super(SecurityConfig.class);
	}

}
