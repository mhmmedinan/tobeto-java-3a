package com.tobeto.rentacar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tobeto.rentacar.entities.concretes.Model;



public interface ModelRepository extends JpaRepository<Model, Integer> {

	@Query("Select m from Model m where m.name=:name ")
	Model findByName(String name);
}
