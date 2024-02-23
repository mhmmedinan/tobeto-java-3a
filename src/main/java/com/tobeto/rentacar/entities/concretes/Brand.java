package com.tobeto.rentacar.entities.concretes;

import java.util.List;

import com.tobeto.rentacar.core.entities.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="brands")
@EqualsAndHashCode(callSuper = true)
public class Brand extends BaseEntity<Integer> {

	
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy = "brand")
	private List<Model> models;
	
	

}








