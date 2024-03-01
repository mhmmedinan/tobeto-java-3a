package com.tobeto.rentacar.business.rules;

import org.springframework.stereotype.Service;

import com.tobeto.rentacar.core.exceptions.types.BusinessException;
import com.tobeto.rentacar.dataAccess.abstracts.BrandRepository;
import com.tobeto.rentacar.entities.concretes.Brand;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BrandBusinessRules {

	private BrandRepository brandRepository;
	
	public void checkIfBrandNameExists(String name) {
		Brand brand = brandRepository.findByNameIgnoreCase(name.trim());
		if(brand!=null) {
			throw new BusinessException("Böyle bir marka daha önce eklendi");
		}
	}
	
//	public void checkIfBrandNameCount(String name) {
//		var brand = brandRepository.countByName(name);
//		if(brand.size()>=2) {
//			throw new BusinessException("2' den fazla marka var zaten.Sistem Hatası");
//		}
//	}
}
