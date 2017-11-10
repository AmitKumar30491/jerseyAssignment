package com.dnb.poc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//Country service class 
public class CountryService {

	
	static HashMap<Integer,Country> countryMap=getCountryMap();


	 public CountryService() {
	  super();

	  if(countryMap==null)
	  {
		  countryMap=new HashMap<Integer,Country>();
	
	   Country countryOne=new Country(1, "Norway",10000);
	   Country countryTwo=new Country(2, "Sweden",20000);
	   Country countryThree=new Country(3, "Germany",30000);
	   Country countryFour=new Country(4, "Italy",40000);


	   countryMap.put(1,countryOne);
	   countryMap.put(2,countryTwo);
	   countryMap.put(3,countryThree);
	   countryMap.put(4,countryFour);
	  }
	 }

	 @SuppressWarnings("rawtypes")
	public List getAllCountries()
	 {
	  @SuppressWarnings({ "unchecked" })
	List countries = new ArrayList(countryMap.values());
	  return countries;
	 }

	 public Country getCountry(int id)
	 {
	  Country country= countryMap.get(id);
	  return country;
	 }
	 public Country addCountry(Country country)
	 {
	  country.setId(countryMap.size()+1);
	  countryMap.put(country.getId(), country);
	  return country;
	 }
	 
	 public static HashMap<Integer, Country> getCountryMap() {
		  return countryMap;
		 }
}
