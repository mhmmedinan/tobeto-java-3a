package com.tobeto.rentacar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobeto.rentacar.entities.concretes.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

	
}
