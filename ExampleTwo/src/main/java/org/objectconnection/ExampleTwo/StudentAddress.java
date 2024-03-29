package org.objectconnection.ExampleTwo;

import javax.persistence.Embeddable;

@Embeddable
public class StudentAddress {
	private String city,state,country;
	
	public StudentAddress() {

	}
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "StudentAddress [city=" + city + ", state=" + state + ", country=" + country + "]";
	}



}
