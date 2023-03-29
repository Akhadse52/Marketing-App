package com.crmzohoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crmzohoapp.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
