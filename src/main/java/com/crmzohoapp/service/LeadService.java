package com.crmzohoapp.service;

import java.util.List;

import com.crmzohoapp.entity.Lead;

public interface LeadService {

	Lead saveLead(Lead lead);

	Lead leadfindById(long id);

	void deleteById(long id);

	List<Lead> findAllLead();

	Lead findByLead(long id);

	

}
