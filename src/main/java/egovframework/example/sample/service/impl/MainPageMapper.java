package egovframework.example.sample.service.impl;

import java.util.List;

import egovframework.example.domain.MainSlideItemVO;
import egovframework.example.domain.SampleFreeVO;
import egovframework.example.domain.SampleListVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("mainPageMapper")
public interface MainPageMapper {
	
	List<SampleListVO> sampleList();

	List<SampleFreeVO> sampleFree();

	List<MainSlideItemVO> slideItem();
}
