package com.spring.project.error;

public class EventNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EventNotFoundException() {
		super("Epic Fail: No existe el evento seleccionado");
	}

	public EventNotFoundException(Long id) {
		super("Epic Fail: No existe el evento " + id);
	}

}
