package com.project.electronicvotingsystem.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.electronicvotingsystem.Entity.AdminEntity;
import com.project.electronicvotingsystem.Exception.AdminNotFoundException;
import com.project.electronicvotingsystem.Service.AdminService;


@RestController
public class AdminController {
	
	@Autowired
	private AdminService adminServices;
	
	@GetMapping("/admin")
	public List<AdminEntity> getAllLogin() {
		return adminServices.getAllAdmin();
	}
	
	@GetMapping("admin/{email}")
	public Optional<AdminEntity> getLoginById(@PathVariable String email) throws AdminNotFoundException {
		return adminServices.getAdmin(email);
	}
	
	@PostMapping("admin")
	public AdminEntity addLogin(@Valid @RequestBody AdminEntity adminEntity) {
		return adminServices.addAdmin(adminEntity);
	}
	
	@PutMapping("admin/{email}")
	public AdminEntity updateLogin(@PathVariable String email,@Valid @RequestBody AdminEntity adminEntity) throws AdminNotFoundException {
		return adminServices.updateAdmin(email, adminEntity);
	}
	
	@DeleteMapping("admin/{email}")
	public Optional<AdminEntity> deleteLogin(@PathVariable String email) throws AdminNotFoundException {
		return adminServices.deleteAdmin(email);
	}

}
