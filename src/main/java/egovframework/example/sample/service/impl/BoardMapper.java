package egovframework.example.sample.service.impl;

import java.util.List;

import egovframework.example.domain.BoardVO;
import egovframework.example.domain.Criteria;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("boardMapper")
public interface BoardMapper {
	List<BoardVO> list(Criteria cri);

	Integer getCnt(Criteria cri);
}
