package com.ducksonflame.artifact.mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

//@Primary
//@Component("mailSender")
//@Component
//@Qualifier("smtp")
public class SmtpMailSender implements MailSender {
	
	private JavaMailSender javaMailSender;
	
	public void setJavaMailSender (JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
	
	@Override  
	public void send(String to, String subject, String body) throws MessagingException {      
		MimeMessage message = javaMailSender.createMimeMessage();   
		MimeMessageHelper helper;  
		helper = new MimeMessageHelper(message, true); // true indicates multipart message   
		helper.setSubject(subject);   
		helper.setTo(to);   
		helper.setText(body, true); // true indicates html  
									// continue using helper for more functionalities
									// like adding attachments, etc.      
		javaMailSender.send(message);  
	} 
}