package com.javadevsguide.springframework.InitializingBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class EmailConfigCacheDesposal implements DisposableBean{
	
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
