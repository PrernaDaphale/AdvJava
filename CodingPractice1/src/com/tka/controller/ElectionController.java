package com.tka.controller;

import java.util.ArrayList;

import com.tka.service.ElectionService;

public class ElectionController {

	public ArrayList<String> fetchCandidatesFromAllStates() {
		ElectionService es = new ElectionService();
		ArrayList<String> al = es.fetchCandidatesFromAllStates();
		return al;
 
	}
	
	public ArrayList<String> fetchCandidatesStartswithS() {
		ElectionService es = new ElectionService();
		ArrayList<String> al = es.fetchCandidatesStartswithS();
		return al;	
	}
	
	public ArrayList<String> fetchCandidatesStartswithSandM() {
		ElectionService es = new ElectionService();
		ArrayList<String> al = es.fetchCandidatesStartswithSandM();
		return al;
		
	}
	
	public ArrayList<String> fetchCandidatesSorted() {
		ElectionService es = new ElectionService();
		ArrayList<String> al = es.fetchCandidatesSorted();
		return al;
		
	}

}
