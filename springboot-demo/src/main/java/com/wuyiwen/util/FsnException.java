package com.wuyiwen.util;

import lombok.Data;

import java.io.Serializable;

@Data
public class FsnException extends RuntimeException implements Serializable {
    public static final FsnException PARAM_ABSENT = new FsnException(Result.PARAMS_ABSENT);

    private Result.Error error;

    public FsnException(Result.Error error) {
        super(error == null ? "" : error.getMsg());
        this.error = error;
    }

    public FsnException() {

    }
}