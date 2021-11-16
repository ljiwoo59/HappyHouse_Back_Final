package com.ssafy.happyhouse.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.happyhouse.model.QnaDto;

@Mapper
public interface QnaMapper {
	List<QnaDto> selectAll();
	QnaDto selectOne(String num);
	void insert(QnaDto qna);
	void delete(String num);
	void modify(QnaDto qna);
}
