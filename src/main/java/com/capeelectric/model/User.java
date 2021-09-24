package com.capeelectric.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;


/**
 * 
 * @author capeelectricsoftware
 *
 */
@Builder
@Entity
@Table(name="users")
public class User {
	
//	private static final long OTP_VALID_DURATION = 5 * 60 * 1000;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private int id;
	@Column(name="password")
	private String password;
	@Column(name="user_active")
	private boolean active;
	@Column(name="email")
	private String email;
	@Column(name="first_name")
	private String firstname;
	@Column(name="last_name")
	private String lastname;
	@Column(name="user_name")
	private String username;
	@Column(name="user_type")
	private String usertype;
	@Column(name = "user_role")
	private String role;
	@Column(name = "creation_date")
	private LocalDateTime creationdate;
	@Column(name = "updated_date")
	private LocalDateTime updateddate;
	@Column(name="user_exist")
	private boolean userexist;
	@Column(name = "one_time_password")
	private Integer otp;
	public User() {
    }
	public User(int id, String password, boolean active, String email, String firstname, String lastname,
			String username, String usertype, String role, LocalDateTime creationdate, LocalDateTime updateddate,
			boolean userexist, Integer otp) {
		super();
		this.id = id;
		this.password = password;
		this.active = active;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.usertype = usertype;
		this.role = role;
		this.creationdate = creationdate;
		this.updateddate = updateddate;
		this.userexist = userexist;
		this.otp = otp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public LocalDateTime getCreationdate() {
		return creationdate;
	}
	public void setCreationdate(LocalDateTime creationdate) {
		this.creationdate = creationdate;
	}
	public LocalDateTime getUpdateddate() {
		return updateddate;
	}
	public void setUpdateddate(LocalDateTime updateddate) {
		this.updateddate = updateddate;
	}
	public boolean isUserexist() {
		return userexist;
	}
	public void setUserexist(boolean userexist) {
		this.userexist = userexist;
	}
	public Integer getOtp() {
		return otp;
	}
	public void setOtp(Integer otp) {
		this.otp = otp;
	}
	
	
}
