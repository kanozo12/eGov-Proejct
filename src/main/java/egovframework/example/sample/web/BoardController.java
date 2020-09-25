package egovframework.example.sample.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import egovframework.example.domain.BoardVO;
import egovframework.example.domain.Criteria;
import egovframework.example.sample.service.BoardService;
import validator.BoardValidator;

@Controller
@RequestMapping("/board/")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	private BoardValidator validator = new BoardValidator();
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String boardList(Criteria criteria, Model model, HttpServletRequest req) {

		List<BoardVO> list = service.list(criteria);
		model.addAttribute("list", list);

		Integer cnt = service.countArticle(criteria);
		criteria.calculate(cnt);

		return "board/list.page";
	}
}
