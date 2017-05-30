package com.test.tl.service.imp;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.test.tl.dao.MemberDAO;
import com.test.tl.dao.MongoDAO;
import com.test.tl.dto.MemberVO;
import com.test.tl.service.MemberService;

public class MemberServiceImp implements MemberService {

	MongoDAO mongoDAO;
	MemberDAO memberDAO;

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	public void setMongoDAO(MongoDAO mongoDAO) {
		this.mongoDAO = mongoDAO;
	}

	@Override
	public void MemberLogin() {
		// TODO Auto-generated method stub

	}

	@Override
	public void MemberUpdate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void MemberDelete() {
		// TODO Auto-generated method stub

	}

	@Override
	public int MemberJoin(MemberVO memberVO) {

		int result = -1;
		
		Criteria criteria = new Criteria("mem_Email");
		criteria.is(memberVO.getMem_Email());
		Query query = new Query(criteria);

		MemberVO member = memberDAO.FindOne(query);

		if (member == null) {
			mongoDAO.insert(memberVO, "member");
			result = 1;
		}
		
		return result;

	}

}
