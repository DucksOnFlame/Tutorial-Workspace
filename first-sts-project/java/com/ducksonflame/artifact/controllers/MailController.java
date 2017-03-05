package com.ducksonflame.artifact.controllers;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ducksonflame.artifact.mail.MailSender;

@RestController
public class MailController {

	private MailSender mailSender;
	
/*	@Resource
	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}
*/
	
	@Autowired
	public MailController (/*@Qualifier("smtpMailSender")*/ MailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	@RequestMapping("/mail")
	public String sendMail() throws MessagingException {
		mailSender.send("bartlomiej.styczynski@gmail.com", "Subject", "The content");
		return "Mail sent";
	}
}
