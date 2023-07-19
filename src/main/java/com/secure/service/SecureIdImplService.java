package com.secure.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.secure.entity.SecureIdEntity;
import com.secure.repository.SecureIdRepository;

@Service
public class SecureIdImplService implements SecureIdService {
	
	@Autowired
	private SecureIdRepository idRepository;

	@Override
	public String findCountry(Integer zzn) {
		String valueOf = String.valueOf(zzn);
		System.out.println(valueOf);
		char charAt = valueOf.charAt(0);
		System.out.println(charAt);
		int numericValue = Character.getNumericValue(charAt);
		
		SecureIdEntity details = idRepository.getById(numericValue);
		String countryName = details.getCountryName();
		return countryName;
	}

}
