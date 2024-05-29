package com.tka.service;

import java.util.ArrayList;
import java.util.Collections;

import com.tka.dao.ElectionDao;

public class ElectionService {

	public ArrayList<String> fetchCandidatesFromAllStates() {
		ElectionDao ed = new ElectionDao();
		ArrayList<String> al = ed.fetchCandidatesFromAllStates();
		return al;

	}
	
	//Starting with S
	public ArrayList<String> fetchCandidatesStartswithS(){
		ElectionDao ed = new ElectionDao();
		ArrayList<String> al = ed.fetchCandidatesFromAllStates();
		
		ArrayList<String> alsCandidateNames1 = new ArrayList<>();
		for(String sCanditateNames1: al) {
			if(sCanditateNames1.startsWith("S")) {
				alsCandidateNames1.add(sCanditateNames1);
			}
		}
		return alsCandidateNames1;
		
	}
	
	//Starting with S & M
	public ArrayList<String> fetchCandidatesStartswithSandM() {
		ElectionDao ed = new ElectionDao();
		ArrayList<String> al = ed.fetchCandidatesFromAllStates();

		ArrayList<String> alsCandidateNames = new ArrayList<>();
		for (String sCandidateNames : al) {
			if (sCandidateNames.startsWith("S") || sCandidateNames.startsWith("M")) {
				alsCandidateNames.add(sCandidateNames);
			}
		}
		return alsCandidateNames;
	}
	
	//sorted list
	public ArrayList<String> fetchCandidatesSorted() {
		ElectionDao ed = new ElectionDao();
		ArrayList<String> al = ed.fetchCandidatesFromAllStates();
		
		ArrayList<String> alsCandidateNames = new ArrayList<>();
		Collections.sort(alsCandidateNames);
		
//		  for (String sCandidateNames : al) { if (sCandidateNames.startsWith("S") ||
//		  sCandidateNames.startsWith("M")) { alsCandidateNames.add(sCandidateNames); }
//		  }
		
		return alsCandidateNames;
	}

	
}
