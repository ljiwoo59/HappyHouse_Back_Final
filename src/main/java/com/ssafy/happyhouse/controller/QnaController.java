package com.ssafy.happyhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.happyhouse.model.QnaDto;
import com.ssafy.happyhouse.model.service.QnaService;

@CrossOrigin("*")
@RestController
public class QnaController {
	
	@Autowired
	QnaService service;
	
	@GetMapping(value="/qna")
	public List<QnaDto> selectAll() throws Exception {
		return service.selectAll();
	}
	
	@GetMapping(value="/qna/{num}")
	public QnaDto selectOne(@PathVariable String num) throws Exception {
		return service.selectOne(num);
	}
	
	@PostMapping(value="/qna")
	public void insert(@RequestBody QnaDto qna) throws Exception {
		service.insert(qna);
	}
	
	@DeleteMapping(value="/qna/{num}")
	public void delete(@PathVariable String num) throws Exception {
		service.delete(num);
	}
	
	@PutMapping(value="/qna")
	public void modify(@RequestBody QnaDto qna) throws Exception {
		service.modify(qna);
	}
	
	@GetMapping(value="/qna/find/{word}")
	public List<QnaDto> search(@PathVariable String word) throws Exception {
		return service.search(word);
	}
	
}
