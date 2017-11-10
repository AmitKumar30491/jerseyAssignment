package com.dnb.poc;
//Country POJO class
public class Country {
	
	int id;
	String countryName;
	int population;
	public Country() {
		super();

	}
	public Country(int id, String countryName, int population) {
		super();
		this.id = id;
		this.countryName = countryName;
		this.population = population;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	

}
