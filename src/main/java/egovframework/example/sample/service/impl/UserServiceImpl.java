package egovframework.example.sample.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import egovframework.example.domain.UserVO;
import egovframework.example.sample.service.UserService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("userService")
public class UserServiceImpl extends EgovAbstractServiceImpl implements UserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	// TODO mybatis 사용
	@Resource(name = "userMapper")
	private UserMapper userDAO;

	@Override
	public UserVO loginUser(UserVO vo) throws Exception {
		return userDAO.loginUser(vo);
	}

	@Override
	public void insertUser(UserVO user) throws Exception {
		userDAO.insertUser(user);
	}

}
