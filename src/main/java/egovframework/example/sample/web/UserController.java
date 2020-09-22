package egovframework.example.sample.web;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import egovframework.example.sample.service.UserService;
import egovframework.example.user.domain.LoginDTO;
import egovframework.example.user.domain.UserVO;

@Controller
@RequestMapping("/user/")
public class UserController {

	@Autowired
	private ServletContext context;

	@Autowired
	private UserService service;

	@RequestMapping(value = "login.do", method = RequestMethod.GET)
	public String viewLoginPage() {
		return "user/login.page";
	}

	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public String userLogin(LoginDTO loginDTO, HttpSession session, Model model, HttpServletRequest req) {
		String msg = "로그인 실패, 아이디와 비밀번호를 확인하세요.";

		if (loginDTO.getUserid() == "" || loginDTO.getPassword() == "") {
			model.addAttribute("msg", msg);
			return "user/login.page";
		}
		UserVO user = service.login(loginDTO.getUserid(), loginDTO.getPassword());
		if (user == null) {
			model.addAttribute("msg", msg);
			return "user/login.page";
		}

		session.setAttribute("user", user);
		System.out.println(user);

		return "redirect:/"; // 로그인 성공시 메인페이지로 리다이렉트\
	}

	@RequestMapping(value = "register.do", method = RequestMethod.GET)
	public String viewRegisterPage() {
		return "user/registerPage.page";
	}

}
