package org.antwalk.model;

import java.util.Arrays;

public class User {
	String name;
	String Gender;
	String country;
	String[] language;;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return Gender;
	}
	public String[] getLanguage() {
		return language;
	}
	public void setLanguage(String[] language) {
		this.language = language;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public User(String name, String gender, String country, String[] language) {
		super();
		this.name = name;
		Gender = gender;
		this.country = country;
		this.language = language;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", Gender=" + Gender + ", country=" + country + ", language="
				+ Arrays.toString(language) + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
