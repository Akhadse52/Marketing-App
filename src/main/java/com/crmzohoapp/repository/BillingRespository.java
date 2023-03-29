package com.crmzohoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crmzohoapp.entity.Billing;

public interface BillingRespository extends JpaRepository<Billing, Long> {

}
