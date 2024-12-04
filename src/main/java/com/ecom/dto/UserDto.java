package com.ecom.dto;

import org.springframework.beans.factory.annotation.Value;

import jakarta.annotation.Nonnull;

public class UserDto {

	@Nonnull
	private String username;
	
	@Nonnull
	private String email;
	
	@Nonnull
	private String password;
	
	@Nonnull
	@Value(value = "user")
	private String role;
	
	@Nonnull
	private String profileImage;
	
	@Nonnull
	private String bio;
	
	@Nonnull
	private String profession;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	
}
