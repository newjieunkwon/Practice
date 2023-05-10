package com.greedy.member.model.service;

import static com.greedy.common.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.greedy.member.model.dao.MemberMapper;
import com.greedy.member.model.dto.MemberDTO;

public class MemberService {
	
	private MemberMapper mapper;
	

	public int insertMember(MemberDTO member) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(MemberMapper.class);
		
		int result = mapper.insertMember(sqlSession, member);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		
		sqlSession.close();
		return result;
		
	}	

	

	public List<MemberDTO> selectAllMembers() {

		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(MemberMapper.class);
		
		List<MemberDTO> memberList = mapper.selectAllMember(sqlSession);
		
		sqlSession.close();
		
		return memberList;
	}

	
	public MemberDTO selectById(String id) {
		
		SqlSession sqlSession = getSqlSession();

		MemberDTO member = mapper.selectById(id);
		
		sqlSession.close();
		
		return member;
	}

	public List<MemberDTO> selectByGender(String gender) {

		SqlSession sqlSession = getSqlSession();

		List<MemberDTO> member = mapper.selectByGender(gender);
		
		sqlSession.close();
		
		return member;
	}

	public int updatePassword(String memberId, String password) {

		SqlSession sqlSession = getSqlSession();

		int member = mapper.updatePassword(memberId, password);
		
		sqlSession.close();
		
		return member;
	}

	public int updateEmail(String memberId, String email) {

		SqlSession sqlSession = getSqlSession();
		
		int result = 0;
		
		result = mapper.updateEmail(memberId, email);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
				
		return result;
	}

	public int updatePhone(String memberId, String phone) {

		SqlSession sqlSession = getSqlSession();
		
		int result = 0;
		
		result = mapper.updatePhone(memberId, phone);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
						
		return result;
	}

	public int updateAddress(String memberId, String address) {

		SqlSession sqlSession = getSqlSession();
		
		int result = 0;
		
		result = mapper.updateAddress(memberId, address);
		

		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
						
		return result;
	}

	public int deleteMember(String memberId) {
		
		SqlSession sqlSession = getSqlSession();
		
		int result = 0;
		
		result = mapper.deleteMember(memberId);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
						
		return result;
	}

}
