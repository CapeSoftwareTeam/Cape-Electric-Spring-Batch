package com.capeelectric.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Register_tbl")
public class Register{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "REGISTER_ID")
	private Integer registerId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "COMPANY_NAME")
	private String companyName;

	@Column(name = "USER_NAME")
	private String username;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "ROLE")
	private String role;

	@Column(name = "CONTACT_NUMBER")
	private String contactNumber;

	@Column(name = "APPLICATION_TYPE")
	private String applicationType;

	@Column(name = "DEPARTMENT")
	private String department;

	@Column(name = "DESIGNATION")
	private String designation;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "DISTRICT")
	private String district;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "PINCODE")
	private String pinCode;

	@Column(name = "STATE")
	private String state;

	@Column(name = "PERMISSION")
	private String permission;

	@Column(name = "PERMISSION_BY")
	private String permissionBy;

	@Column(name = "COMMENT")
	private String comment;
	
	@Column(name = "OTP_SESSION_KEY")
	private String otpSessionKey;
	
	@Column(name = "ASSIGNED_BY")
	private String assignedBy;
	
	@Column(name = "NO_OF_LICENCE")
	private String noOfLicence;

	@Column(name = "CREATED_DATE")
	private LocalDateTime createdDate;
	
	@Column(name = "UPDATED_DATE")
	private LocalDateTime updatedDate;
	
	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@Column(name = "UPDATED_BY")
	private String updatedBy;

	public Integer getRegisterId() {
		return registerId;
	}

	public void setRegisterId(Integer registerId) {
		this.registerId = registerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public String getPermissionBy() {
		return permissionBy;
	}

	public void setPermissionBy(String permissionBy) {
		this.permissionBy = permissionBy;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getOtpSessionKey() {
		return otpSessionKey;
	}

	public void setOtpSessionKey(String otpSessionKey) {
		this.otpSessionKey = otpSessionKey;
	}

	public String getAssignedBy() {
		return assignedBy;
	}

	public void setAssignedBy(String assignedBy) {
		this.assignedBy = assignedBy;
	}

	public String getNoOfLicence() {
		return noOfLicence;
	}

	public void setNoOfLicence(String noOfLicence) {
		this.noOfLicence = noOfLicence;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}