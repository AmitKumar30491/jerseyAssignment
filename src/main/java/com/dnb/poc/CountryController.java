package com.dnb.poc;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//Country Controller class
@Path("/countries")
public class CountryController {
	CountryService countryService = new CountryService();
	@SuppressWarnings("rawtypes")
	@GET
    @Produces(MediaType.APPLICATION_JSON)
 public List getCountries()
 {
  
  List listOfCountries=countryService.getAllCountries();
  return listOfCountries;
 }
 
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
 public Country getCountryById(@PathParam("id") int id)
 {
  return countryService.getCountry(id);
 }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
 public Country addCountry(Country country)
 {
  return countryService.addCountry(country);
 }
}
