package com.project.electronicvotingsystem;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.project.electronicvotingsystem.Entity.ScheduleEntity;
import com.project.electronicvotingsystem.Entity.UserEntity;
import com.project.electronicvotingsystem.Exception.UserNotFoundException;
import com.project.electronicvotingsystem.Service.UserService;

@ExtendWith(MockitoExtension.class)
public class UserTest {

	@Mock
	UserService userService;

	@Test
	void addUserTest(){

		UserEntity userEntity = new UserEntity(1,"mahii","Hyderabad",LocalDate.of( 2012 , 12 , 7 ),"male","8790012308","hyd");
		when(userService.addUser(userEntity)).thenReturn(userEntity);
		assertEquals(userService.addUser(userEntity),userEntity);
	}
	
	@Test
	void getUserTest() throws UserNotFoundException {
		UserEntity userEntity = new UserEntity(1,"mahii","Hyderabad",LocalDate.of( 2012 , 12 , 7 ),"male","8790012308","hyd");
		Optional<UserEntity> OUserEntity = Optional.of(userEntity);
		when(userService.getUser(1)).thenReturn(OUserEntity);
		assertEquals(userService.getUser(1).get(),userEntity);
	}
	
	@Test
	void updateUserTest() throws UserNotFoundException {
		UserEntity userEntity = new UserEntity(1,"mahii","Hyderabad",LocalDate.of( 2012 , 12 , 7 ),"male","8790012308","hyd");
		when(userService.updateUser(1,userEntity)).thenReturn(userEntity);
		assertEquals(userService.updateUser(1,userEntity),userEntity);
	}
	
	@Test
	void deleteUserTest() throws UserNotFoundException {
		UserEntity userEntity = new UserEntity(1,"mahii","Hyderabad",LocalDate.of( 2012 , 12 , 7 ),"male","8790012308","hyd");
		Optional<UserEntity> OUserEntity = Optional.of(userEntity);
		when(userService.deleteUser(1)).thenReturn(OUserEntity);
		assertEquals(userService.deleteUser(1).get(),userEntity);
	}

}
