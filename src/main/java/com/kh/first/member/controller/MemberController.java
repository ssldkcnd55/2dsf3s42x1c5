package com.kh.first.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitterReturnValueHandler;

import com.kh.first.member.model.service.MemberService;
import com.kh.first.member.model.vo.Member;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@RequestMapping(value="login.do",  method = RequestMethod.POST)
	public ModelAndView loginCheck(Member member,ModelAndView mv) {
		
		//스프링에서는 메소드의 매개변수로 클래스명 레퍼런스 변수 선언하면 자동으로 해당클래스에 대한 객체 생성이 된다
		
		System.out.println("전송와서 저장된 값 : "+member);
		
		Member returnMember = memberService.selectMember(member);
		System.out.println("return member  : "+returnMember);
		mv.addObject("member",returnMember);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("test.do")
	public String testMethod(HttpServletRequest request,HttpServletResponse response) {
		String userid=request.getParameter("userid");
		String userpwd=request.getParameter("userpwd");
		
		Member member=new Member();
		member.setUserid(userid);
		member.setUserpwd(userpwd);
		
		System.out.println("member :"+userid+userpwd);
		
		
		return "home";
	}
	
}
