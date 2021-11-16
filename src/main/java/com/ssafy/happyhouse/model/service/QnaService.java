package com.ssafy.happyhouse.model.service;

import java.util.List;

import com.ssafy.happyhouse.model.QnaDto;

public interface QnaService {
	List<QnaDto> selectAll() throws Exception;
	QnaDto selectOne(String num) throws Exception;
	void insert(QnaDto qna) throws Exception;
	void delete(String num) throws Exception;
	void modify(QnaDto qna) throws Exception;
	
}
