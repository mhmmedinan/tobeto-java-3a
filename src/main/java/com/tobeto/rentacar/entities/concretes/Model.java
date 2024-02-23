package com.tobeto.rentacar.entities.concretes;

import java.util.List;

import com.tobeto.rentacar.core.entities.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="models") 
@EqualsAndHashCode(callSuper = true)
public class Model extends BaseEntity<Integer> {

	
	
	@Column(name="name")
	private String name; //A6 
	
	@ManyToOne
	@JoinColumn(name="brandId")
	private Brand brand;
	
	@OneToMany(mappedBy = "model")
	private List<Car> cars;
	
}
