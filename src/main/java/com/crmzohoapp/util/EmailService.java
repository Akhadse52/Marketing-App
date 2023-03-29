package com.crmzohoapp.util;

public interface EmailService {
	
	public void sendMail(String to, String subject,String messege);
	public void sendMailWithAttachment(String to, String subject, String body, String filepath);
	
}
