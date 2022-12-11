package com.notimplement.happygear.service;

import java.util.List;
import java.util.Map;

import com.notimplement.happygear.entities.Product;
import com.notimplement.happygear.model.dto.ProductDto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.util.Pair;

public interface ProductService {
	
	List<ProductDto> listAll();

	Map<List<ProductDto>, Integer> listByPage(Pageable pageable);

	ProductDto getById(Integer id);

	ProductDto create(ProductDto pic);

	ProductDto update(ProductDto pic);

	ProductDto delete(Integer id);
}
