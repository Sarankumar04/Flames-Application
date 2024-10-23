package com.love_calculator.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.love_calculator")

public class BeanConfiguration {

//	@Autowired
//	Environment env;
//	
//	@Bean
//	public JavaMailSender getMailSender() {
//		JavaMailSenderImpl mailSender=new JavaMailSenderImpl();
//		
//		mailSender.setHost(env.getProperty("mail.host"));
//		mailSender.setUsername(env.getProperty("mail.username"));
//		mailSender.setPassword(env.getProperty("mail.pasword"));
//		mailSender.setPort(Integer.parseInt(env.getProperty("mail.host")));
//		
//		System.out.println(env.getProperty("mail.host"));
//		
//		return mailSender;
//	}
	
	@Bean()
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/jsp/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
}
