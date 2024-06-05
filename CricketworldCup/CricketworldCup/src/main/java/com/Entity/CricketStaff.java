package com.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class CricketStaff {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int staffId;
	String staffName;
	String staffAge;
	String staffNoofYearsToBCCI;
	
	
	public CricketStaff() {
		super();
	
	}


	public CricketStaff(String staffName, String staffAge, String staffNoofYearsToBCCI) {
		super();
		this.staffName = staffName;
		this.staffAge = staffAge;
		
		this.staffNoofYearsToBCCI = staffNoofYearsToBCCI;
	}


	public CricketStaff(int staffId, String staffName, String staffAge, String staffNoofYearsToBCCI) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffAge = staffAge;
		this.staffNoofYearsToBCCI = staffNoofYearsToBCCI;
	}




	@Override
	public String toString() {
		return "CricketStaff [staffId=" + staffId + ", staffName=" + staffName + ", staffAge=" + staffAge
				+ " staffNoofYearsToBCCI=" + staffNoofYearsToBCCI + "]";
	}


	public int getStaffId() {
		return staffId;
	}


	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}


	public String getStaffName() {
		return staffName;
	}


	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}


	public String getStaffAge() {
		return staffAge;
	}


	public void setStaffAge(String staffAge) {
		this.staffAge = staffAge;
	}

	public String getStaffNoofYearsToBCCI() {
		return staffNoofYearsToBCCI;
	}


	public void setStaffNoofYearsToBCCI(String staffNoofYearsToBCCI) {
		this.staffNoofYearsToBCCI = staffNoofYearsToBCCI;
	}
	
	

}
