package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.domain.BoardVO;
import egovframework.example.domain.Criteria;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("boardDAO")
public class BoardDAO extends EgovAbstractDAO {

	public List<BoardVO> list(Criteria cri) {
		return (List<BoardVO>) list("boardDAO.list", cri);
	}

	public Integer getCnt(Criteria cri) {
		return (Integer) select("boardDAO.getCnt", cri);
	}
}
