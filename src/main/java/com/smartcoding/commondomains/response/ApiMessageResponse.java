package com.smartcoding.commondomains.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class ApiMessageResponse {

    private String type;

    private String message;

    private final String status;

    private LocalDateTime timestamp;

}
