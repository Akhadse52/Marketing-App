package com.crmzohoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmzohoapp.entity.Contact;
import com.crmzohoapp.entity.Lead;
import com.crmzohoapp.repository.ContactRepository;
import com.crmzohoapp.service.LeadService;

@Controller
public class LeadController {
	
	private LeadService leadService;
	
	public LeadController(LeadService leadService) {
		this.leadService = leadService;
	}
	
	
	
	@Autowired
	private ContactRepository contactRepo;
	

	@RequestMapping("/lead")
	public String leadPage() {
		return "lead_page";
	}
	
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute Lead lead , ModelMap modelMap) {
		Lead save = leadService.saveLead(lead);
		modelMap.addAttribute("save", save);
		return "lead_Details";
		
	}
	
	
	
	@RequestMapping("/findById")
	public String contactSaveData(@RequestParam("id") long id, ModelMap modelMap) {
		 Lead lead = leadService.leadfindById(id);
		
		 Contact c = new Contact();
		 c.setFirstName(lead.getFirstName());
		 c.setMiddleName(lead.getMiddleName());
		 c.setLastName(lead.getLastName());
		 c.setEmailId(lead.getEmailId());
		 c.setMobileNumber(lead.getMobileNumber());
		 
		  contactRepo.save(c);
		 
		 leadService.deleteById(id);
		 
		 List<Contact> allContact = contactRepo.findAll();
		 modelMap.addAttribute("allContact", allContact);
		 
		return "all_Contact";
	}
	
	@RequestMapping("/AllLead")
	public String allLead(ModelMap modelMap) {
		List<Lead> allLead = leadService.findAllLead();
		modelMap.addAttribute("allLead", allLead);
		return "list_AllLead";
	}
	
	@RequestMapping("/findByLeadId")
	public String findByLeadId(@RequestParam("id")long id ,ModelMap modelMap) {
		
		Lead save = leadService.findByLead(id);
		modelMap.addAttribute("save", save);
		return "lead_Details";
	}
	
	
	
	

}
