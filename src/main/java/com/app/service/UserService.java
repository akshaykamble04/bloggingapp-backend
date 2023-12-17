package com.app.service;

import java.util.List;

import com.app.dto.UserDto;

public interface UserService {
	
	UserDto registerNewRegister(UserDto userDto);
	
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user,Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUser();
	void deleteUser(Integer userId);
	

}
