package com.searchmarketingapp1.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.searchmarketingapp1.dto.Lead;

@Controller
public class SearchLeadController{
	@Autowired
	private LeadClient Client;
	
	
	@RequestMapping("/search")
	public String viewSearchLeadPage() {
	return "search_lead";
	
}
	@RequestMapping(value = "/findLead",method=RequestMethod.POST)
	public String findLead(@RequestParam("id") long id ,ModelMap model) {
		Lead lead = Client.getOneLeadInfo(id);
		model.addAttribute("lead", lead);
		return "lead_info";
		
		
		
	}
}