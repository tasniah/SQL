package io.mtech.model;

public class User {
	String e_name;
	String e_id;
	int e_salary;
	String e_country;
	String e_city;
	int e_zipCode;

	


	public String getE_name() {
		return e_name;
	}




	public void setE_name(String e_name) {
		this.e_name = e_name;
	}




	public String getE_id() {
		return e_id;
	}




	public void setE_id(String e_id) {
		this.e_id = e_id;
	}




	public int getE_salary() {
		return e_salary;
	}




	public void setE_salary(int e_salary) {
		this.e_salary = e_salary;
	}




	public String getE_country() {
		return e_country;
	}




	public void setE_country(String e_country) {
		this.e_country = e_country;
	}




	public String getE_city() {
		return e_city;
	}




	public void setE_city(String e_city) {
		this.e_city = e_city;
	}




	public int getE_zipCode() {
		return e_zipCode;
	}




	public void setE_zipCode(int e_zipCode) {
		this.e_zipCode = e_zipCode;
	}




	@Override
	public String toString() {
		return "User [e_name=" + e_name + ", e_id=" + e_id + ", e_salary=" + e_salary + ", e_country=" + e_country
				+ ", e_city=" + e_city + ", e_zipCode=" + e_zipCode + "]";
	}




	
	
	
	
	

}