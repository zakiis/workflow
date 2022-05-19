package com.zakiis.workflow.exception;

import com.zakiis.exception.ZakiisRuntimeException;

public class WorkflowRuntimeException extends ZakiisRuntimeException {

	private static final long serialVersionUID = 6847233990347553274L;

	public WorkflowRuntimeException() {
		super();
	}

	public WorkflowRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public WorkflowRuntimeException(String message) {
		super(message);
	}

	public WorkflowRuntimeException(Throwable cause) {
		super(cause);
	}

}
