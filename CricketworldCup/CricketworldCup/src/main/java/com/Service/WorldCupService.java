package com.Service;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.WorldCupDao;
import com.Entity.CricketStaff;

@Service
public class WorldCupService {

	@Autowired
	WorldCupDao cupDao;
	
	public int allIndianCricketStaffCount() {
		
		List<CricketStaff> cricketStaffs = cupDao.allIndianCricketStaffList();
		return cricketStaffs.size();
	}
	
	public HashMap<String, String> fetchNamewitHashMapAge() {
		
		HashMap<String, String> ageNameMap = new HashMap<String, String>();
		
		List<CricketStaff> cricketStaffs = cupDao.allIndianCricketStaffList();
		
		for (CricketStaff cricketStaff : cricketStaffs) {
			ageNameMap.put(cricketStaff.getStaffName(), cricketStaff.getStaffAge());
		}
		return ageNameMap;	
	}

	public String fetchNamewithMaxYears() {
		
		List<CricketStaff> cricketStaffs = cupDao.allIndianCricketStaffList();
	
		TreeMap<String, String> agenameMap = new TreeMap<String, String>();
		for (CricketStaff cricketStaff : cricketStaffs) {
			agenameMap.put(cricketStaff.getStaffName(), cricketStaff.getStaffNoofYearsToBCCI());
		}
		
		System.err.println(agenameMap);
		String nameofPerson = agenameMap.get("13");
		
		return nameofPerson;
		
		
	}



}
