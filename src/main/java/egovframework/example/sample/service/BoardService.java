package egovframework.example.sample.service;

import java.util.List;

import egovframework.example.domain.BoardVO;
import egovframework.example.domain.Criteria;

public interface BoardService {
	List<BoardVO> list(Criteria cri);
	
	Integer countArticle(Criteria cri);

}
