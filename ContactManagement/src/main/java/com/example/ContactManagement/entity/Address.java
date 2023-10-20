package com.example.ContactManagement.entity;

import jakarta.persistence.*;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer addressId;
	String flatNo;
	String area;
	String city;
	String zipcode;
	String userId;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(Integer addressId, String flatNo, String area, String city, String zipcode, String userId) {
		super();
		this.addressId = addressId;
		this.flatNo = flatNo;
		this.area = area;
		this.city = city;
		this.zipcode = zipcode;
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", flatNo=" + flatNo + ", area=" + area + ", city=" + city
				+ ", zipcode=" + zipcode + ", userId=" + userId + "]";
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	

}
