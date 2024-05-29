package com.tka.dao;
//dao = data access object

import java.util.ArrayList;

public class ElectionDao {
	
	public ArrayList<String> fetchCandidatesFromAllStates() {
		ArrayList<String> al = new ArrayList<>();
		al.add("MH"); // make shamap
		al.add("UP");
		al.add("MP");
		al.add("SIKKIM");
		return al;

	}
}
