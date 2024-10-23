package com.love_calculator.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import com.love_calculator.configuration.*;
public class DispatcherServletConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class clas[]= {BeanConfiguration.class};
		return clas;
	}

	@Override
	protected String[] getServletMappings() {
		String mapping[]= {"/*"};
		return mapping;
	}

}
