package com.example.ContactManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer contactId;
	String firstName;
	String lastName;
	Integer mobileNumber;
	Integer officeNumber;
	String email;
	String citiy;
	Integer userId ;
	@Override
	public String toString() {
		return "Contact [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber="
				+ mobileNumber + ", officeNumber=" + officeNumber + ", email=" + email + ", citiy=" + citiy
				+ ", contactId=" + contactId + "]";
	}
	public Contact(Integer userId, String firstName, String lastName, Integer mobileNumber, Integer officeNumber,
			String email, String citiy, Integer contactId) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.officeNumber = officeNumber;
		this.email = email;
		this.citiy = citiy;
		this.contactId = contactId;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Integer getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(Integer officeNumber) {
		this.officeNumber = officeNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCitiy() {
		return citiy;
	}
	public void setCitiy(String citiy) {
		this.citiy = citiy;
	}
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	
	
	

}
