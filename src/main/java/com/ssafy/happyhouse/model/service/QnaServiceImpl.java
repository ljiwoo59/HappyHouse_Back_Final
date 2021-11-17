package com.ssafy.happyhouse.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.ssafy.happyhouse.model.QnaDto;
import com.ssafy.happyhouse.model.mapper.QnaMapper;

@Service
public class QnaServiceImpl implements QnaService {

	@Autowired
	QnaMapper mapper;
	
	@Override
	public List<QnaDto> selectAll() throws Exception {
		return mapper.selectAll();
	}

	@Override
	public QnaDto selectOne(@PathVariable String num) throws Exception {
		return mapper.selectOne(num);
	}

	@Override
	public void insert(@RequestBody QnaDto qna) throws Exception {
		mapper.insert(qna);

	}

	@Override
	public void delete(@PathVariable String num) throws Exception {
		mapper.delete(num);

	}

	@Override
	public void modify(@RequestBody QnaDto qna) throws Exception {
		mapper.modify(qna);

	}

	@Override
	public List<QnaDto> search(@PathVariable String word) throws Exception {
		return mapper.search(word);
		
	}

}
