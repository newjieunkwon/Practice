package com.greedy.member.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.greedy.member.model.dto.MemberDTO;

public interface MemberMapper {

	public int insertMember(SqlSession sqlSession, MemberDTO member);
	
	public List<MemberDTO> selectAllMember(SqlSession sqlSession);
	
	public int updateMember(SqlSession sqlSession, MemberDTO member);
	
	public int deleteMember(SqlSession sqlSession, int code);
	
	public int updatePassword(String memberId, String password);

	public int updateEmail(String memberId, String email);
	
	public int updateAddress(String memberId, String address);
	
	public int deleteMember(String memberId);

	public MemberDTO selectById(String id);

	public List<MemberDTO> selectByGender(String gender);

	public int updatePhone(String memberId, String phone);



}
