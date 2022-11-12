package com.smartcoding.commondomains.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class ApiErrorResponse {

    private String message;

    private String type;

    private String status;

    private int errorCode;

    private LocalDateTime timestamp;

    private String path;

}
