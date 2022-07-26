package com.project.electronicvotingsystem.Exception;

public class ElectionNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3196021386402422805L;


	public ElectionNotFoundException() {
	}

	public ElectionNotFoundException(String message) {
		super(message);
	}
}



