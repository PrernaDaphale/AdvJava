package com.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Entity.CricketStaff;

@Repository
public class WorldCupDao {

	@Autowired
	SessionFactory factory;
	
	public List<CricketStaff> allIndianCricketStaffList(){
		
		System.err.println("factory >>>" +factory);
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CricketStaff.class);
		
		List<CricketStaff> cricketStaffList = criteria.list();
		System.out.println(cricketStaffList);
			
		return cricketStaffList;
		
		
	}
}
