package com.secure.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.secure.service.SecureIdImplService;

@RestController
public class SecureIdController {
	
	@Autowired
	private SecureIdImplService idImplService;
     
	@GetMapping("/ssn/{ssn}")
	public String getCountryName(@PathVariable("ssn") Integer ssn) {
		String country = idImplService.findCountry(ssn);
		return country;
	}
}
