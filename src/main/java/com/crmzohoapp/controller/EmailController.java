package com.crmzohoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmzohoapp.dto.LeadDto;
import com.crmzohoapp.util.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	

	@RequestMapping("/findEmailId")
	public String findEmailId(@RequestParam("emailId") String emailId ,ModelMap modelMap) {
		modelMap.addAttribute("emailId",emailId );
		return "compose_mail";
	}
	
	@RequestMapping("/triggerMail")
	public String triggerMail(LeadDto leadDto ,ModelMap modelMap) {
		emailService.sendMail(leadDto.getTo(), leadDto.getSubject(), leadDto.getMessege());
		modelMap.addAttribute("send", "Mail Send Succefully");
		return "compose_mail";
	}

}
