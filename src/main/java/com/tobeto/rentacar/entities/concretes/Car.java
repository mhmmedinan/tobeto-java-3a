package com.tobeto.rentacar.entities.concretes;

import com.tobeto.rentacar.core.entities.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="cars")
@EqualsAndHashCode(callSuper = true)
public class Car extends BaseEntity<Integer> {

	@Column(name="modelYear")
	private int modelYear;
	
	@Column(name="plate")
	private String plate;
	
	@Column(name="state")
	private int state; //1-Available 2-Rented 3-Under Maintance
	
	@Column(name="dailyPrice")
	private double dailyPrice;
	
	@ManyToOne
	@JoinColumn(name="modelId")
	private Model model;
	
	
}
