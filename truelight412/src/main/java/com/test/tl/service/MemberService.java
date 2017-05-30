package com.test.tl.service;

import org.springframework.data.mongodb.core.query.Query;

import com.test.tl.dto.MemberVO;

public interface MemberService {
	
	public void MemberLogin();
	public void MemberUpdate();
	public void MemberDelete();
	public int MemberJoin(MemberVO memberVO);

}
