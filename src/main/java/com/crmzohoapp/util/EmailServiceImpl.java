package com.crmzohoapp.util;

import java.io.File;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void sendMail(String to, String subject, String messege) {
		 SimpleMailMessage mail = new SimpleMailMessage();
		 mail.setTo(to);
		 mail.setSubject(subject);
		 mail.setText(messege);
		 javaMailSender.send(mail);
	}

	@Override
	public void sendMailWithAttachment(String to, String subject, String body, String filepath) {
		 MimeMessage message = javaMailSender.createMimeMessage();
		 try {
			 MimeMessageHelper helper = new MimeMessageHelper(message, true);
			    
			    helper.setTo(to);
			    helper.setSubject(subject);
			    helper.setText(body);
			    
			    helper.addAttachment("billId",new File(filepath));
			    
			    javaMailSender.send(message);
			 
		 }catch (Exception e) {
			e.printStackTrace();
		}
		    
	}
	

}
