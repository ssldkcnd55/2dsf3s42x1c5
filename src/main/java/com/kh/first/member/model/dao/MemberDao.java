package com.kh.first.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.first.member.model.vo.Member;

@Repository("memberDao")
public class MemberDao {
	
	//마이바티스 연결과 메퍼 쿼리문 실행을 위한 클래스
	@Autowired
	private SqlSessionTemplate sqlSession;

	public Member selectMember(Member member) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("loginMember",member);
	}
	

}
