package com.nyfts.business.control.service.presentation.dto.shared;

public class ErrorResponseTO {
    private String error;

    public ErrorResponseTO(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
