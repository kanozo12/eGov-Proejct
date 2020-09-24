package egovframework.example.sample.service.impl;

import org.springframework.stereotype.Repository;

import egovframework.example.domain.LoginVO;
import egovframework.example.domain.UserVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("userDAO")
public class UserDAO extends EgovAbstractDAO {
	public UserVO loginUser(UserVO vo) throws Exception {

		return (UserVO) select("userDAO.loginUser", vo);
	}
}
