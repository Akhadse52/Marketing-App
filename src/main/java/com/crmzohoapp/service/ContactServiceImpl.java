package com.crmzohoapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crmzohoapp.entity.Contact;
import com.crmzohoapp.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	
	@Autowired
	private ContactRepository contactRepo;

	@Override
	public List<Contact> findAllContact() {
		List<Contact> findAll = contactRepo.findAll();
		return findAll;
	}

	@Override
	public Contact findById(long id) {
		
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact ;
	}

	@Override
	public void save(Contact contact) {
		contactRepo.save(contact);
		
	}

	@Override
	public void deleteById(long id) {
		contactRepo.deleteById(id);
	}

}
