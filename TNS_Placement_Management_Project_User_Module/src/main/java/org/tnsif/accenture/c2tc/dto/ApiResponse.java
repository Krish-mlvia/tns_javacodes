package org.tnsif.accenture.c2tc.dto;

import java.time.LocalDateTime;

public class ApiResponse {

    private LocalDateTime timestamp;
    private String message;
    private int status;
    private Object data;

    public ApiResponse() {
        this.timestamp = LocalDateTime.now();
    }

    public ApiResponse(String message, int status, Object data) {
        this.timestamp = LocalDateTime.now();
        this.message = message;
        this.status = status;
        this.data = data;
    }

    public ApiResponse(String message, int status) {
        this(message, status, null);
    }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public int getStatus() { return status; }
    public void setStatus(int status) { this.status = status; }

    public Object getData() { return data; }
    public void setData(Object data) { this.data = data; }
}
