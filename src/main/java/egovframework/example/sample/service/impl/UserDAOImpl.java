package egovframework.example.sample.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import egovframework.example.domain.UserVO;
import egovframework.example.sample.service.UserDAO;

@Repository
public class UserDAOImpl implements UserDAO{

	@Override
	public UserVO getUser(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO loginUser(String userid, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertUser(UserVO user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLevelTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertLevelData(Integer level, Integer exp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getRequireExp(Integer level) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLevelAndExp(UserVO user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserVO getCnt(String userid) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
