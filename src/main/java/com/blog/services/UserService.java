package com.blog.services;

import java.util.List;

import com.blog.payloads.UserDto;

public interface UserService {
	
	UserDto registerNewUser(UserDto dto);
	
	UserDto createUser(UserDto userDto);
	
	UserDto updateUser(UserDto userDto, Integer userId);
	
	UserDto getUserById(Integer userId);
	
	List<UserDto> getAllUsers();
	
	void deleteUser(Integer userId);
	

}
