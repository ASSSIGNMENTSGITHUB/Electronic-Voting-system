package com.project.electronicvotingsystem.Exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.validation.FieldError;

@ControllerAdvice
public class AllExceptionsHandler {
	
	@ExceptionHandler({
		CandidateInvalidCredentialsExceptions.class,
		AdminInvalidCredentialsExceptions.class,
		ElectionInvalidCredentialsExceptions.class,
		PartyInvalidCredentialsExceptions.class,
		UserInvalidCredentialsExceptions.class,
		ScheduleInvalidCredentialsExceptions.class,
		VoterRequestInvalidCredentialsExceptions.class
	})
	public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
	    Map<String, String> errors = new HashMap<>();
	    ex.getBindingResult().getAllErrors().forEach((error) -> {
	        String fieldName = ((FieldError) error).getField();
	        String errorMessage = error.getDefaultMessage();
	        errors.put(fieldName, errorMessage);
	    });
	    return errors;
	}
	
	
	@ExceptionHandler({
			CandidateAlreadyExistsException.class,
			AdminAlreadyExistsException.class,
			ElectionAlreadyExistsException.class,
			UserAlreadyExistsException.class,
			PartyAlreadyExistsException.class,
			ScheduleAlreadyExistsException.class,
			VoterRequestAlreadyExistsException.class,
			CandidateNotFoundException.class,
			AdminNotFoundException.class,
			ElectionNotFoundException.class,
			UserNotFoundException.class,
			PartyNotFoundException.class,
			ScheduleNotFoundException.class,
			VoterRequestNotFoundException.class
	})
	public Map<String, String> handleAddressNotFoundException(Exception ex) {
	    Map<String, String> errors = new HashMap<>();
	    errors.put("Error", ex.toString());
	    errors.put("Message", ex.getMessage());
	    return errors;
	}
	
}
