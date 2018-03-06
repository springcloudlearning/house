package com.ymd.learn.house.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ymd.learn.house.common.model.User;

@Mapper
public interface UserMapper {
	
	public List<User> selectUsers();
	
	
}
