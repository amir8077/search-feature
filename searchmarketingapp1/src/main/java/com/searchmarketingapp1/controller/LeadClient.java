package com.searchmarketingapp1.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.searchmarketingapp1.dto.Lead;

@Component
public class LeadClient {
	
	public Lead getOneLeadInfo(long id) {
		RestTemplate rest = new RestTemplate();
		Lead lead = rest.getForObject("http://localhost:8080/leads/api/get/"+id, Lead.class);
		return lead;
		
	}

}
