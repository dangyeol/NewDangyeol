package com.test.tl.service.imp;

import java.util.List;

import org.springframework.data.mongodb.core.query.Query;

import com.test.tl.dao.MongoDAO;
import com.test.tl.dao.ProductDAO;
import com.test.tl.dto.ProductVO;
import com.test.tl.service.ProductService;

public class ProductServiceImp implements ProductService {

	MongoDAO mongoDAO;
	ProductDAO productDAO;

	
	
	
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	public void setMongoDAO(MongoDAO mongoDAO) {
		this.mongoDAO = mongoDAO;
	}

	@Override
	public void ProductRegist(ProductVO productVO) {
		mongoDAO.insert(productVO, "product");

	}

	@Override
	public void ProductBuy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void productCancel() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ProductVO> ProductList(Query query) {
		
		List<ProductVO> list = productDAO.Find(query);
		
		return list;
	}

	@Override
	public ProductVO ProductDetail(Query query) {
		
		ProductVO productVO=productDAO.FindOne(query);
		return productVO;
	}

}
