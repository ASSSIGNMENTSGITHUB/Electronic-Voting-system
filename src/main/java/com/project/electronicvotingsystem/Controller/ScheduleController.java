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

import com.project.electronicvotingsystem.Entity.ScheduleEntity;
import com.project.electronicvotingsystem.Exception.ScheduleNotFoundException;
import com.project.electronicvotingsystem.Service.ScheduleService;

@RestController
public class ScheduleController {
	
	@Autowired
	private ScheduleService scheduleServices;
	
	@GetMapping("/schedule")
	public List<ScheduleEntity> getAllSchedule() {
		return scheduleServices.getAllSchedule();
	}
	
	@GetMapping("schedule/{id}")
	public Optional<ScheduleEntity> getScheduleById(@PathVariable int id) throws ScheduleNotFoundException {
		return scheduleServices.getSchedule(id);
	}
	
	@PostMapping("schedule")
	public ScheduleEntity addSchedule(@Valid @RequestBody ScheduleEntity scheduleEntity) {
		return scheduleServices.addSchedule(scheduleEntity);
	}
	
	@PutMapping("schedule/{id}")
	public ScheduleEntity updateSchedule(@PathVariable int id,@Valid @RequestBody ScheduleEntity scheduleEntity) throws ScheduleNotFoundException {
		return scheduleServices.updateSchedule(id, scheduleEntity);
	}
	
	@DeleteMapping("schedule/{id}")
	public Optional<ScheduleEntity> deleteSchedule(@PathVariable int id) throws ScheduleNotFoundException {
		return scheduleServices.deleteSchedule(id);
	}

}

