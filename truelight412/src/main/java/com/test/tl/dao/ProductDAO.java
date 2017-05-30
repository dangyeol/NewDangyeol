package com.test.tl.dao;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import com.test.tl.dto.ProductVO;

public class ProductDAO {

	private MongoTemplate mongoTemplate;

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	public ProductDAO() {
		String mongoContextPath = "/mongoContext.xml";
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(mongoContextPath);
		mongoTemplate = (MongoTemplate) ctx.getBean("mongoTemplate");

	}

	public List<ProductVO> Find(Query query) {

		List<ProductVO> list = (List<ProductVO>) mongoTemplate.find(query, ProductVO.class, "product");

		return list;
	}

	public ProductVO FindOne(Query query) {
		
		ProductVO productVO = mongoTemplate.findOne(query, ProductVO.class, "product");

		return productVO;
	}

}
