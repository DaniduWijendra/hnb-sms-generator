package com.example.hnbsmsgenerator.ussd;

import com.example.hnbsmsgenerator.enumarators.Encoding;
import com.example.hnbsmsgenerator.enumarators.UssdOperation;

import javax.validation.constraints.NotBlank;

public class SendRequest {
    @NotBlank
    private final String applicationId;
    @NotBlank
    private final String password;
    private String version;
    @NotBlank
    private String message;
    @NotBlank
    private String sessionId;
    private UssdOperation ussdOperation;
    @NotBlank
    private String destinationAddress;
    private Encoding encoding;
    private double chargingAmount;

    public SendRequest(@NotBlank String applicationId, @NotBlank String password) {
        this.applicationId = applicationId;
        this.password = password;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public String getPassword() {
        return password;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public Encoding getEncoding() {
        return encoding;
    }

    public void setEncoding(Encoding encoding) {
        this.encoding = encoding;
    }

    public double getChargingAmount() {
        return chargingAmount;
    }

    public void setChargingAmount(double chargingAmount) {
        this.chargingAmount = chargingAmount;
    }
}
