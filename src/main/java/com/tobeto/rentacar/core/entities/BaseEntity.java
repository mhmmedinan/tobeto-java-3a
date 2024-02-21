package com.tobeto.rentacar.core.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@MappedSuperclass
public class BaseEntity<T> {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private T id;
	
	@Column(name="createdDate")
	private LocalDateTime createdDate;
	
	@Column(name="updatedDate")
	private LocalDateTime updatedDate;
	
	@Column(name="deletedDate")
	private LocalDateTime deletedDate;
	
}
