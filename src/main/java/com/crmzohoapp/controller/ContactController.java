package com.crmzohoapp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmzohoapp.entity.Contact;
import com.crmzohoapp.service.ContactService;

@Controller
public class ContactController {
	
	
	@Autowired
	private ContactService contactService;
	
	
	@RequestMapping("/AllContact")
	public String allContact(ModelMap modelMap) {
		List<Contact> allContact = contactService.findAllContact();
		modelMap.addAttribute("allContact", allContact);
		return "all_Contact";
	}
	
	
	@RequestMapping("/findByIdContact")
	public String findByIdContact(@RequestParam("id") long id , ModelMap modelMap) {
		Contact contact = contactService.findById(id);
		modelMap.addAttribute("contact", contact);
		return "contact_page";
	}
	@RequestMapping("/update")
	public String findById(@RequestParam("id") long id ,ModelMap modelMap) {
		Contact byId = contactService.findById(id);
		modelMap.addAttribute("byId", byId);
		return "update_Contact";
		
	}
	@RequestMapping("/updatePage")
	public String updatePage(@ModelAttribute("contact") Contact contact,ModelMap modelMap) {
		contactService.save(contact);
		List<Contact> allContact = contactService.findAllContact();
		modelMap.addAttribute("allContact", allContact);
		return "all_Contact";
		
	}
	@RequestMapping("/delete")
	public String deleteById(@RequestParam("id") long id,ModelMap modelMap) {
		contactService.deleteById(id);
		List<Contact> allContact = contactService.findAllContact();
		modelMap.addAttribute("allContact", allContact);
		return "all_Contact";
		
	}
	

}
