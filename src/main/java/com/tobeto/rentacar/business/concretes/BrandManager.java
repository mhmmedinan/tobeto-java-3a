package com.tobeto.rentacar.business.concretes;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.tobeto.rentacar.business.abstracts.BrandService;
import com.tobeto.rentacar.business.constants.BrandMessages;
import com.tobeto.rentacar.business.requests.create.brand.CreateBrandRequest;
import com.tobeto.rentacar.business.responses.create.brand.CreateBrandResponse;
import com.tobeto.rentacar.business.responses.get.brand.GetAllBrandResponse;
import com.tobeto.rentacar.business.responses.get.brand.GetBrandResponse;
import com.tobeto.rentacar.core.utilities.mapping.ModelMapperService;
import com.tobeto.rentacar.core.utilities.results.DataResult;
import com.tobeto.rentacar.core.utilities.results.SuccessDataResult;
import com.tobeto.rentacar.dataAccess.abstracts.BrandRepository;
import com.tobeto.rentacar.entities.concretes.Brand;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;
	private ModelMapperService mapperService;

	@Override
	public DataResult<CreateBrandResponse> add(CreateBrandRequest request) {
		Brand brand = mapperService.forRequest().map(request, Brand.class);
		brand.setCreatedDate(LocalDateTime.now());
        brandRepository.save(brand);
        
        CreateBrandResponse response = mapperService.forResponse()
        		.map(brand,CreateBrandResponse.class);
        return new 
        		SuccessDataResult<CreateBrandResponse>(response,BrandMessages.BrandAdded);
        
	}

	@Override
	public DataResult<List<GetAllBrandResponse>> getAll() {
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandResponse> brandResponses = 
				brands.stream().map(brand ->
				mapperService.forResponse().map
				(brand, GetAllBrandResponse.class))
				.collect(Collectors.toList());
		return new 
				SuccessDataResult
				<List<GetAllBrandResponse>>(brandResponses,BrandMessages.BrandListed);
	}

	@Override
	public GetBrandResponse getById(int id) {
		Brand brand = brandRepository.getById(id);
		GetBrandResponse response = 
				mapperService.forResponse().map(brand,GetBrandResponse.class);
		return response;
	}
	

}
