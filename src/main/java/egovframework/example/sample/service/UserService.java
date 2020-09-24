package egovframework.example.sample.service;

import egovframework.example.domain.LoginVO;
import egovframework.example.domain.UserVO;

public interface UserService {

	UserVO loginUser(UserVO vo) throws Exception;
}