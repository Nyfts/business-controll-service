package com.nyfts.business.control.service.application.handler;

import com.nyfts.business.control.service.application.service.exception.InformationNotFoundException;
import com.nyfts.business.control.service.presentation.dto.shared.ErrorResponseTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ InformationNotFoundException.class })
    public ResponseEntity<ErrorResponseTO> handleInformationNotFoundException(InformationNotFoundException ex, WebRequest request) {
        return ResponseEntity.badRequest().body(new ErrorResponseTO("Information not found!"));
    }
}
