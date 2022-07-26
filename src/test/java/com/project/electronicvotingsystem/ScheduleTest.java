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
import com.project.electronicvotingsystem.Exception.ScheduleNotFoundException;
import com.project.electronicvotingsystem.Service.ScheduleService;

@ExtendWith(MockitoExtension.class)
public class ScheduleTest {

	@Mock
	ScheduleService scheduleService;

	@Test
	void addScheduleTest(){
		ScheduleEntity scheduleEntity = new ScheduleEntity(1,"Sarpanch Elecctions",LocalDate.of( 2012 , 12 , 7 ));
		when(scheduleService.addSchedule(scheduleEntity)).thenReturn(scheduleEntity);
		assertEquals(scheduleService.addSchedule(scheduleEntity),scheduleEntity);
	}
	
	@Test
	void getScheduleTest() throws ScheduleNotFoundException {
		ScheduleEntity scheduleEntity = new ScheduleEntity(1,"Sarpanch Elecctions",LocalDate.of( 2012 , 12 , 7 ));
		Optional<ScheduleEntity> OScheduleEntity = Optional.of(scheduleEntity);
		when(scheduleService.getSchedule(1)).thenReturn(OScheduleEntity);
		assertEquals(scheduleService.getSchedule(1).get(),scheduleEntity);
	}
	
	@Test
	void updateScheduleTest() throws ScheduleNotFoundException {
		ScheduleEntity scheduleEntity = new ScheduleEntity(1,"Sarpanch Elecctions",LocalDate.of( 2012 , 12 , 7 ));
		when(scheduleService.updateSchedule(1,scheduleEntity)).thenReturn(scheduleEntity);
		assertEquals(scheduleService.updateSchedule(1,scheduleEntity),scheduleEntity);
	}
	
	@Test
	void deleteScheduleTest() throws ScheduleNotFoundException {
		ScheduleEntity scheduleEntity = new ScheduleEntity(1,"Sarpanch Elecctions",LocalDate.of( 2012 , 12 , 7 ));
		Optional<ScheduleEntity> OScheduleEntity = Optional.of(scheduleEntity);
		when(scheduleService.deleteSchedule(1)).thenReturn(OScheduleEntity);
		assertEquals(scheduleService.deleteSchedule(1).get(),scheduleEntity);
	}

}
