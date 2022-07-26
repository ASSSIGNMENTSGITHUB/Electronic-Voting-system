package com.project.electronicvotingsystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.electronicvotingsystem.Entity.ScheduleEntity;
import com.project.electronicvotingsystem.Exception.ScheduleNotFoundException;

@Service
public interface ScheduleService {

	public List<ScheduleEntity> getAllSchedule();
	
	public Optional<ScheduleEntity> getSchedule(int id) throws ScheduleNotFoundException;
	
	public ScheduleEntity addSchedule(ScheduleEntity scheduleEntity);
	
	public Optional<ScheduleEntity> deleteSchedule(int id) throws ScheduleNotFoundException;
	
	public ScheduleEntity updateSchedule(int id, ScheduleEntity scheduleEntity) throws ScheduleNotFoundException;
}

