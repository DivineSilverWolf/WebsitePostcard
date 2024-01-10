package ru.nsu.fit.websitepostcard.exceptions;

import java.util.Date;

public class ErrorDetails {
    private Date timeout;
    private String message;
    private String details;

    public ErrorDetails(Date timeout, String message, String details) {
        this.timeout = timeout;
        this.message = message;
        this.details = details;
    }

    public Date getTimeout() {
        return timeout;
    }

    public void setTimeout(Date timeout) {
        this.timeout = timeout;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
