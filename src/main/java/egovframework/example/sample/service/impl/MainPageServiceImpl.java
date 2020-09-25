package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import egovframework.example.domain.MainSlideItemVO;
import egovframework.example.domain.SampleFreeVO;
import egovframework.example.domain.SampleListVO;
import egovframework.example.sample.service.MainPageService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("mainPageService")
public class MainPageServiceImpl extends EgovAbstractServiceImpl implements MainPageService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	// TODO mybatis 사용
	@Resource(name = "mainPageMapper")
	private MainPageMapper mainPageDAO;

	@Override
	public List<SampleListVO> sampleList() {
		return mainPageDAO.sampleList();
	}

	@Override
	public List<SampleFreeVO> sampleFree() {
		return mainPageDAO.sampleFree();
	}

	@Override
	public List<MainSlideItemVO> getSlideItem() {
		return 	mainPageDAO.slideItem();
	}

}
