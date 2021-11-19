package com.ssafy.happyhouse.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.happyhouse.model.UserDto;
@Mapper
public interface UserMapper {

	public List<UserDto> selectAll();
	public UserDto selectOne(String id);
	public int insert(UserDto c);	
	public int delete(String id);
	public List<UserDto> findByAddress(String address);
	public int update(UserDto c);
	public UserDto login(UserDto c);
	public UserDto login(Map<String, String> map);
}
