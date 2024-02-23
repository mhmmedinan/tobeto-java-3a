package com.tobeto.rentacar.core.utilities.paging;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageDto {

	private String sortDirection;
	private String[] sortBy;
	private int pageNumber;
	private int pageSize;
}
