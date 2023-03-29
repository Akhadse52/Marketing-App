package com.crmzohoapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.crmzohoapp.entity.Lead;
import com.crmzohoapp.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	
	
	private LeadRepository leadRepo;
	
	
	
	

	public LeadServiceImpl(LeadRepository leadRepo) {
		this.leadRepo = leadRepo;
	}

	@Override
	public Lead saveLead(Lead lead) {
		Lead save = leadRepo.save(lead);
		return save;
	}


	@Override
	public Lead leadfindById(long id) {
		Optional<Lead> byId = leadRepo.findById(id);
		Lead lead = byId.get();
		return lead;
	}

	@Override
	public void deleteById(long id) {
		leadRepo.deleteById(id);
		
	}

	@Override
	public List<Lead> findAllLead() {
		List<Lead> findAllLead = leadRepo.findAll();
		
		return findAllLead;
	}

	@Override
	public Lead findByLead(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	
	
	
	
}
