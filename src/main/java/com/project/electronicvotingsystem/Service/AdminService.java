package com.project.electronicvotingsystem.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.electronicvotingsystem.Entity.AdminEntity;
import com.project.electronicvotingsystem.Exception.AdminNotFoundException;


@Service
public interface AdminService {

	public List<AdminEntity> getAllAdmin();
	
	public Optional<AdminEntity> getAdmin(String id) throws AdminNotFoundException;
	
	public AdminEntity addAdmin(AdminEntity adminEntity);
	
	public Optional<AdminEntity> deleteAdmin(String id) throws AdminNotFoundException;
	
	public AdminEntity updateAdmin(String id, AdminEntity adminEntity) throws AdminNotFoundException;
	
}
