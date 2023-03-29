package com.crmzohoapp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmzohoapp.entity.Billing;
import com.crmzohoapp.repository.BillingRespository;
import com.crmzohoapp.util.EmailService;
import com.crmzohoapp.util.PDFgeneretor;

@Service
public class BillingServiceImpl implements BillingService {
	
	
	@Autowired
	private BillingRespository billingRepo;
	
	@Autowired
	private PDFgeneretor pdfGeneretor;
	
	@Autowired
	private EmailService emailService;
	
	
	
	

	@Override
	public void save(Billing billing) {
		
		
		
		emailService.sendMail(billing.getEmailId(), "Generated Bill", "Hey Dear \n" +
				billing.getFirstName()+billing.getMiddleName()+billing.getLastName()+"\n your Bill Amount is : -"+billing.getAmount()+"\n and Product is :- "+billing.getProduct() +"Succefully generated Bill \n  Thank You \n Visit again");
		

		
		Billing save = billingRepo.save(billing);
		String filepath = "D://Spring Bott Project for version 4.17//crmzohoapp//billpdf//billId"+save.getId()+".pdf";
		pdfGeneretor.generatePDF(save,filepath);
		emailService.sendMailWithAttachment(billing.getEmailId(), "Generated Bill","attachment Of Billing PDF ",filepath);
		 
	}
	
	

}
