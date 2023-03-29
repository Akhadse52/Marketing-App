package com.crmzohoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmzohoapp.entity.Billing;
import com.crmzohoapp.entity.Contact;
import com.crmzohoapp.service.BillingService;
import com.crmzohoapp.service.ContactService;

@Controller
public class BillingController {
	
	
	private ContactService contactService;

	public BillingController(ContactService contactService) {
	
		this.contactService = contactService;
	}
	
	@Autowired
	private BillingService billingService;






	@RequestMapping("/billing")
	public String billing(@RequestParam("id") long id, ModelMap modelMap) {
		Contact contact = contactService.findById(id);
		modelMap.addAttribute("contact", contact);
		return"billing_page";
		
	}
	
	@RequestMapping("/billingAmount")
	public String billingAmount(@ModelAttribute("billing") Billing billing,ModelMap modelMap) {
		billingService.save(billing);
		modelMap.addAttribute("succefully", "Bill generated Succefully  And Email Send");
		return"billing_page";
	
	
	}
	

}
