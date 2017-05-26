package com.test.tl.dao;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.test.tl.dto.MemberVO;

public class MongoDAO {

	private MongoTemplate mongoTemplate;

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	public MongoDAO() {
		String mongoContextPath = "/mongoContext.xml";
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(mongoContextPath);
		mongoTemplate = (MongoTemplate) ctx.getBean("mongoTemplate");

	}

	public void insert(Object object, String collectionName) {

		mongoTemplate.insert(object, collectionName);

	}

	public void update(Query query, Update update, String collectionName) {

		mongoTemplate.updateFirst(query, update, collectionName);

	}

	public void delete(Query query, String collectionName) {
		mongoTemplate.remove(query, collectionName);

	}

}
