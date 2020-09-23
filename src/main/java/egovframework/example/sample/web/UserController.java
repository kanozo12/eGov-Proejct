package egovframework.example.sample.web;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import egovframework.example.domain.LoginDTO;
import egovframework.example.domain.RegisterDTO;
import egovframework.example.domain.UserVO;
import egovframework.example.sample.service.UserService;
import validator.RegisterValidator;

@Controller
@RequestMapping("/user/")
public class UserController {

	@Autowired
	private ServletContext context;

	@Autowired
	private UserService service;

	private RegisterValidator validator = new RegisterValidator();

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
	public String viewRegisterPage(Model model) {
		model.addAttribute("registerDTO", new RegisterDTO());
		return "user/registerPage.page";
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String userRegist(RegisterDTO dto, Errors errors) throws Exception {
		validator.validate(dto, errors);
		if (errors.hasErrors()) {
			return "user/registerPage.page";
		}

		String uploadPath = context.getRealPath("/WEB-INF/upload");
		MultipartFile file = dto.getProfileImg();
//		String upFile = UploadFileUtils.uploadFile(uploadPath, file.getOriginalFilename(), file.getBytes());

		UserVO user = new UserVO();
//		user.setImg(upFile);
		user.setName(dto.getUsername());
		user.setPassword(dto.getPassword());
		user.setUserid(dto.getUserid());

		service.register(user);

		return "redirect:/"; // 회원가입완료후 메인 페이지로 이동
	}

}
