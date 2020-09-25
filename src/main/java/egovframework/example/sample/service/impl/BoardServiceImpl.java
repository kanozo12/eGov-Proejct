package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import egovframework.example.domain.BoardVO;
import egovframework.example.domain.Criteria;
import egovframework.example.sample.service.BoardService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("boardService")
public class BoardServiceImpl extends EgovAbstractServiceImpl implements BoardService {
	private static final Logger LOGGER = LoggerFactory.getLogger(BoardServiceImpl.class);

	@Resource(name = "boardMapper")
	private BoardMapper boardDAO;

	@Override
	public List<BoardVO> list(Criteria cri) {
		return boardDAO.list(cri);
	}

	@Override
	public Integer countArticle(Criteria cri) {
		return boardDAO.getCnt(cri);
	}

}
