package com.test.tl.service.imp;

import com.test.tl.dao.MongoDAO;
import com.test.tl.service.ProductService;

public class ProductServiceImp implements ProductService {

	MongoDAO mongoDAO;

	public void setMongoDAO(MongoDAO mongoDAO) {
		this.mongoDAO = mongoDAO;
	}

	@Override
	public void ProductRegist() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ProductBuy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void productCancel() {
		// TODO Auto-generated method stub

	}

}
