package com.project.electronicvotingsystem.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.electronicvotingsystem.Entity.ScheduleEntity;
import com.project.electronicvotingsystem.Exception.ScheduleNotFoundException;
import com.project.electronicvotingsystem.Repository.ScheduleRepository;
import com.project.electronicvotingsystem.Service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	private ScheduleRepository scheduleRepo;
	
	@Override
	public List<ScheduleEntity> getAllSchedule() {
		return scheduleRepo.findAll();
	}

	@Override
	public Optional<ScheduleEntity> getSchedule(int id) throws ScheduleNotFoundException {
		try {
			Optional<ScheduleEntity> scheduleData = scheduleRepo.findById(id);
			if(!scheduleData.isEmpty()) {
				return scheduleRepo.findById(id);
			}
			else {
				throw new ScheduleNotFoundException("Schedule Data not found");
			}
		}
		catch(Exception e){
			throw new ScheduleNotFoundException("Schedule Data not found");
		}	
	}

	@Override
	public ScheduleEntity addSchedule(ScheduleEntity scheduleEntity) {
		// TODO Auto-generated method stub
		return scheduleRepo.save(scheduleEntity);
	}

	@Override
	public Optional<ScheduleEntity> deleteSchedule(int id) throws ScheduleNotFoundException {

		try {
			Optional<ScheduleEntity> scheduleData = scheduleRepo.findById(id);
			if(!scheduleData.isEmpty()) {
				scheduleRepo.deleteById(id);
				return scheduleData;
			}
			else {
				throw new ScheduleNotFoundException("Schedule Data not found");
			}
		}
		catch(Exception e){
			throw new ScheduleNotFoundException("Schedule Data not found");
		}
	}

	@Override
	public ScheduleEntity updateSchedule(int id, ScheduleEntity scheduleEntity) throws ScheduleNotFoundException {
		try {
			Optional<ScheduleEntity> scheduleData = scheduleRepo.findById(id);
			if(!scheduleData.isEmpty()) {
				scheduleEntity.setId(id);
				return scheduleRepo.save(scheduleEntity);
			}
			else {
				throw new ScheduleNotFoundException("Schedule Data not found");
			}
		}
		catch(Exception e){
			throw new ScheduleNotFoundException("Schedule Data not found");
		}	
	}
	

}

