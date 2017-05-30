package com.test.tl.service;

import java.util.List;

import org.springframework.data.mongodb.core.query.Query;

import com.test.tl.dto.ProductVO;

public interface ProductService {
	
	public void ProductRegist(ProductVO productVO);
	public void ProductBuy();
	public void productCancel();
	public List<ProductVO> ProductList(Query query);
	public ProductVO ProductDetail(Query query);


}
