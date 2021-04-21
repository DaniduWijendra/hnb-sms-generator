package com.example.hnbsmsgenerator.recieve;

import com.example.hnbsmsgenerator.enumarators.DeliveryStatusRequest;
import com.example.hnbsmsgenerator.enumarators.Encoding;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.List;

public class RecieveRequest {
    @NotBlank
    private String version;
    @NotBlank
    private final String applicationId;
    @NotBlank
    private String sourceAddress;
    @NotBlank
    private String message;
    @NotBlank
    private String requestId;
    private Encoding encoding;

    public RecieveRequest(@JsonProperty("applicationId") String applicationId) {
        this.applicationId = applicationId;
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

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Encoding getEncoding() {
        return encoding;
    }

    public void setEncoding(Encoding encoding) {
        this.encoding = encoding;
    }
}
