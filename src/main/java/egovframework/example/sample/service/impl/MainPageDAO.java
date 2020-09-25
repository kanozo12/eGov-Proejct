package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.domain.MainSlideItemVO;
import egovframework.example.domain.SampleFreeVO;
import egovframework.example.domain.SampleListVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("mainPageDAO")
public class MainPageDAO extends EgovAbstractDAO {
	public List<SampleListVO> sampleList(){
		return (List<SampleListVO>) list("mainPageDAO.sampleList");
	}

	public List<SampleFreeVO> sampleFree(){
		return (List<SampleFreeVO>) list("mainPageDAO.sampleFree");
	}

	public List<MainSlideItemVO> slideItem(){
		return (List<MainSlideItemVO>) list("mainPageDAO.slideItem");
	}
}
