package com.project.electronicvotingsystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.electronicvotingsystem.Entity.UserEntity;
import com.project.electronicvotingsystem.Exception.UserNotFoundException;


@Service
public interface UserService {

	public List<UserEntity> getAllUser();
	
	public Optional<UserEntity> getUser(int id) throws UserNotFoundException;
	
	public UserEntity addUser(UserEntity userEntity);
	
	public Optional<UserEntity> deleteUser(int id) throws UserNotFoundException;
	
	public UserEntity updateUser(int id, UserEntity userEntity) throws UserNotFoundException;
}