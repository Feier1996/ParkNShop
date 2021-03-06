package com.ten.ParkNShop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ten.ParkNShop.entity.Product;

public interface ProductMapper {
	
	int addProduct(Product product);

	int count(int sellerId);

	List<Product> findAllBySellerId(int sellerId);
	
	int delete(@Param("productId")int productId);

	Product findByProductId(int productId);

	int updateProduct1(Product product);
	
	int updateProduct2(Product product);

}
