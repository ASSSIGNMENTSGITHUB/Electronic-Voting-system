package com.project.electronicvotingsystem;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.project.electronicvotingsystem.Entity.AdminEntity;
import com.project.electronicvotingsystem.Exception.AdminNotFoundException;
import com.project.electronicvotingsystem.Service.AdminService;

@ExtendWith(MockitoExtension.class)
public class AdminTests {

	@Mock
	AdminService adminService;

	@Test
	void addAdminTest(){
		AdminEntity adminEntity = new AdminEntity("mahii@qwe.com","7412589630");
		when(adminService.addAdmin(adminEntity)).thenReturn(adminEntity);
		assertEquals(adminService.addAdmin(adminEntity),adminEntity);
	}
	
	@Test
	void getAdminTest() throws AdminNotFoundException {
		AdminEntity adminEntity = new AdminEntity("mahii@qwe.com","7412589630");
		Optional<AdminEntity> OAdminEntity = Optional.of(adminEntity);
		when(adminService.getAdmin("mahii@qwe.com")).thenReturn(OAdminEntity);
		assertEquals(adminService.getAdmin("mahii@qwe.com").get(),adminEntity);
	}
	
	@Test
	void updateAdminTest() throws AdminNotFoundException {
		AdminEntity adminEntity = new AdminEntity("mahii@qwe.com","7412589630");
		when(adminService.updateAdmin("mahii@qwe.com",adminEntity)).thenReturn(adminEntity);
		assertEquals(adminService.updateAdmin("mahii@qwe.com",adminEntity),adminEntity);
	}
	
	@Test
	void deleteAdminTest() throws AdminNotFoundException {
		AdminEntity adminEntity = new AdminEntity("mahii@qwe.com","7412589630");
		Optional<AdminEntity> OAdminEntity = Optional.of(adminEntity);
		when(adminService.deleteAdmin("mahii@qwe.com")).thenReturn(OAdminEntity);
		assertEquals(adminService.deleteAdmin("mahii@qwe.com").get(),adminEntity);
	}

}
