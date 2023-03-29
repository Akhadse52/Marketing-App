package com.crmzohoapp.service;

import java.util.List;

import com.crmzohoapp.entity.Contact;

public interface ContactService {

	List<Contact> findAllContact();

	Contact findById(long id);

	void save(Contact contact);

	void deleteById(long id);

}
