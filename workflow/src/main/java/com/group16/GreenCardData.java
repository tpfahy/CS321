package com.group16;

import java.util.Date;

public class GreenCardData {
	private String name;
	private Date dateOfBirth;
	private Date residenceSince;
	private String aNumber;
	private String ssn;
	private String address;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getResidenceSince() {
		return residenceSince;
	}

	public void setResidenceSince(Date residenceSince) {
		this.residenceSince = residenceSince;
	}

	public String getANumber() {
		return aNumber;
	}

	public void setANumber(String aNumber) {
		this.aNumber = aNumber;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
