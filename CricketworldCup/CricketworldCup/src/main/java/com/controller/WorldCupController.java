package com.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Service.WorldCupService;

@RestController
public class WorldCupController {
	
	@Autowired
	WorldCupService wCupService;
	
	@GetMapping("totalCricketStaff")
	public int allIndianCricketStaffCount() {
		
		return wCupService.allIndianCricketStaffCount();
	}

	@GetMapping("agenameStaff")
	public HashMap<String, String> fetchNamewitHashMapAge() {
		return wCupService.fetchNamewitHashMapAge();	
	}

	@GetMapping("maxYearstobcci")
	public String fetchNamewithMaxYears() {
		return null;
	}
	
}
