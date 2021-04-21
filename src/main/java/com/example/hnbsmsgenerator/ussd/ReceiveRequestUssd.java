package com.example.hnbsmsgenerator.ussd;

import com.example.hnbsmsgenerator.enumarators.Encoding;
import com.example.hnbsmsgenerator.enumarators.UssdOperation;

import javax.validation.constraints.NotBlank;

public class ReceiveRequestUssd {
    @NotBlank
    private String version;
    @NotBlank
    private String applicationId;
    @NotBlank
    private String sessionId;
    private UssdOperation ussdOperation;
    @NotBlank
    private String sourceAddress;
    private String virAddress;
    @NotBlank
    private String message;
    private Encoding encoding;
    @NotBlank
    private String requestId;

    public ReceiveRequestUssd() {
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public UssdOperation getUssdOperation() {
        return ussdOperation;
    }

    public void setUssdOperation(UssdOperation ussdOperation) {
        this.ussdOperation = ussdOperation;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getVirAddress() {
        return virAddress;
    }

    public void setVirAddress(String virAddress) {
        this.virAddress = virAddress;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Encoding getEncoding() {
        return encoding;
    }

    public void setEncoding(Encoding encoding) {
        this.encoding = encoding;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
