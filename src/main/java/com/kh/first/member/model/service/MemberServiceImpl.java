package com.kh.first.member.model.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.kh.first.member.model.vo.Member;

@Service("memberService")
public class MemberServiceImpl implements MemberService{

	@Override
	public Member selectMember(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Member> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member selectOne(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertMember(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMember(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
