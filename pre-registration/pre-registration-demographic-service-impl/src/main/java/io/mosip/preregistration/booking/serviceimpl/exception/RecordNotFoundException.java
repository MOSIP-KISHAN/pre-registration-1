package io.mosip.preregistration.booking.serviceimpl.exception;

import io.mosip.kernel.core.exception.BaseUncheckedException;
import io.mosip.preregistration.core.common.dto.MainResponseDTO;
import lombok.Getter;


@Getter
public class RecordNotFoundException extends BaseUncheckedException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2782261618399872549L;
	private MainResponseDTO<?> mainResponseDTO;

	public RecordNotFoundException(String msg) {
		super("", msg);
	}

	public RecordNotFoundException(String msg, Throwable cause) {
		super("", msg, cause);
	}

	public RecordNotFoundException(String errorCode, String errorMessage) {
		super(errorCode, errorMessage, null);
	}
	
	public RecordNotFoundException(String errorCode, String errorMessage,MainResponseDTO<?> response) {
		super(errorCode, errorMessage, null);
		this.mainResponseDTO=response;
	}

	public RecordNotFoundException(String errorCode, String errorMessage, Throwable rootCause) {
		super(errorCode, errorMessage, rootCause);
	}

	public RecordNotFoundException() {
		super();
	}
}
