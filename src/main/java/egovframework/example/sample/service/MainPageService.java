package egovframework.example.sample.service;

import java.util.List;

import egovframework.example.domain.MainSlideItemVO;
import egovframework.example.domain.SampleFreeVO;
import egovframework.example.domain.SampleListVO;

public interface MainPageService {
	List<SampleListVO> sampleList();

	List<SampleFreeVO> sampleFree();

	List<MainSlideItemVO> getSlideItem();
}
