package com.semin.app.member;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

// anntation: 설명 + 기능
@Controller
@RequestMapping("/member/*")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="join", method = RequestMethod.GET)
	public String join() {
		System.out.println("회원 가입 페이지");
		
		return "member/join";
	}
	//(3)
	@RequestMapping(value="join", method = RequestMethod.POST)
	public void join(MemberDTO memberDTO) {
		// 파라미터의 이름과 dto의 setter의 이름이 같아야 함
		// 타입도 동일해야함
		System.out.println(memberDTO.getName());
		
		memberDTO.getAge();	
		
		System.out.println("Join Post");
	}
    //(2)
//	@RequestMapping(value="join", method = RequestMethod.POST)
//	public void join(@RequestParam(name = "name") String name, @RequestParam(name = "age") Integer age) {
//
//		MemberDTO memberDTO = new MemberDTO();
//		memberDTO.setName(name);
//		memberDTO.setAge(age);
//		
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println("Join Post");
//	}
	//(1)
//	@RequestMapping(value="join", method = RequestMethod.POST)
//	public String join(HttpServletRequest request) {
//		String name = request.getParameter("name");
//		String age = request.getParameter("age");
//		String birth = request.getParameter("birth");
//		String[] nums = request.getParameterValues("num");
//		
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(birth);
//
//		return "member/join";
//	}
	
	
	@RequestMapping("login")
	public String login() {
		return "member/login";
	}
}
