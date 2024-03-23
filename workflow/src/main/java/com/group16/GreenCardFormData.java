package com.group16;

import java.time.LocalDate;

/**
 * Class that represents the data that is stored in a green card form.
 */
public class GreenCardFormData {
	// user's name
	private String name;
	// user DOB
	private LocalDate dateOfBirth;
	// time of residence
	private LocalDate residenceSince;
	// unique identifying number
	private String aNumber;
	// user ssn
	private String ssn;
	// user address
	private String address;
	// user gender
	private String gender;

	// should we have a way to store other family members or no?

	// return the name of the user
	public String getName() {
		return name;
	}

	// set the name of the user
	public void setName(String name) {
		this.name = name;
	}

	// gets the date of birth of the user
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	// sets the date of birth of the user
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	// gets the time the user started being a resident
	public LocalDate getResidenceSince() {
		return residenceSince;
	}

	// sets the time the user started being a resident
	public void setResidenceSince(LocalDate residenceSince) {
		this.residenceSince = residenceSince;
	}

	// gets the unique ID number
	public String getANumber() {
		return aNumber;
	}

	// sets the unique ID number
	public void setANumber(String aNumber) {
		this.aNumber = aNumber;
	}

	// gets the SSN of the user
	public String getSsn() {
		return ssn;
	}

	// sets the SSN of the user
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	// gets the address of the user
	public String getAddress() {
		return address;
	}

	// sets the address of the user
	public void setAddress(String address) {
		this.address = address;
	}

	// gets the gender of the user
	public String getGender() {
		return gender;
	}

	// sets the gender of the user
	public void setGender(String gender) {
		this.gender = gender;
	}
}
