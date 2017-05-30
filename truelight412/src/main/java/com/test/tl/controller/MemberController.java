package com.test.tl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.tl.dto.MemberVO;
import com.test.tl.service.MemberService;

@Controller
@RequestMapping("member")
public class MemberController {

	@Autowired
	MemberService memberService;

	@RequestMapping("/join")
	public String JoinForm() {

		String str = "joinForm";

		return str;
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String MemberJoin(MemberVO memberVO) {

		String str = "main/home";

		int result = memberService.MemberJoin(memberVO);

		return str;

	}

}
