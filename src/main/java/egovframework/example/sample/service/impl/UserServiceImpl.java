package egovframework.example.sample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.domain.UserVO;
import egovframework.example.sample.service.UserDAO;
import egovframework.example.sample.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;

	@Override
	public UserVO getUserInfo(String userid) {
		return userDao.getUser(userid);
	}

	@Override
	public UserVO login(String userid, String password) {
		return userDao.loginUser(userid, password);
	}

	@Override
	public void register(UserVO user) {
		userDao.insertUser(user);
	}

	@Override
	public void fillLevelTable(Integer max) {
		userDao.deleteLevelTable(); // 레벨 데이터 삭제하고

		for (int i = 0; i <= max; i++) {
			Integer exp = (int) Math.floor(Math.pow(((double) i - 1) * 50 / 49, 2.5) * 10);
			userDao.insertLevelData(i, exp);
		}
	}

	@Override
	public UserVO appExp(String userid, Integer exp) {
		UserVO user = userDao.getUser(userid);
		user.setU_exp(user.getU_exp() + exp);
		Integer requireExp = userDao.getRequireExp(user.getU_level() + 1);

		if (user.getU_exp() >= requireExp) {
			user.setU_exp(user.getU_exp() - requireExp);
			user.setU_level(user.getU_level() + 1);
		}

		// 경험치 증가 처리후 DB에 저장
		userDao.setLevelAndExp(user);

		return user;
	}

	@Override
	public UserVO getCnt(String userid) {
		return userDao.getCnt(userid);
	}

}
