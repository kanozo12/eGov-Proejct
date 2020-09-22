package egovframework.example.sample.service;

import egovframework.example.user.domain.UserVO;

public interface UserDAO {
	public UserVO getUser(String userid);

	public UserVO loginUser(String userid, String password);

	public void insertUser(UserVO user);

	// 레벨업 테이블 클리어
	public void deleteLevelTable();

	// 레벨업 테이블 데이터 추가
	public void insertLevelData(Integer level, Integer exp);

	// 필요 경험치 알아내기
	public Integer getRequireExp(Integer level);

	// 레벨과 경험치 셋팅하기
	public void setLevelAndExp(UserVO user);

	public UserVO getCnt(String userid);
}
