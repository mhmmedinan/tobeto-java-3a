package com.tobeto.rentacar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobeto.rentacar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {

	Brand getById(int id);
	Brand getByName(String name);
	
}
