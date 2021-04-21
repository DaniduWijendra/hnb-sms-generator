package com.example.hnbsmsgenerator.sent;

import com.example.hnbsmsgenerator.enumarators.DeliveryStatusRequest;
import com.example.hnbsmsgenerator.enumarators.Encoding;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.List;

public class SmsRequest {
    @NotBlank
    private final String applicationId;
    @NotBlank
    private final String password;
    private String version;
    private List<String> destinationAddresses;
    @NotBlank
    private String message;
    private String sourceAddress;
    private DeliveryStatusRequest deliveryStatusRequest;
    private Encoding encoding;
    private double  chargingAmount;
    private String binaryHeader;

    public SmsRequest(@JsonProperty("applicationId") String applicationId, @JsonProperty("password") String password) {
        this.applicationId = applicationId;
        this.password = password;
    }

    public SmsRequest(String applicationId, String password, String version, List<String> destinationAddresses, String message, String sourceAddress, DeliveryStatusRequest deliveryStatusRequest, Encoding encoding, double chargingAmount, String binaryHeader) {
        this.applicationId = applicationId;
        this.password = password;
        this.version = version;
        this.destinationAddresses = destinationAddresses;
        this.message = message;
        this.sourceAddress = sourceAddress;
        this.deliveryStatusRequest = deliveryStatusRequest;
        this.encoding = encoding;
        this.chargingAmount = chargingAmount;
        this.binaryHeader = binaryHeader;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getDeliveryStatusRequest() {
        return deliveryStatusRequest.getText();
    }

    public void setDeliveryStatusRequest(DeliveryStatusRequest deliveryStatusRequest) {
        this.deliveryStatusRequest = deliveryStatusRequest;
    }

    public String getEncoding() {
        return encoding.getText();
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

    public String getBinaryHeader() {
        return binaryHeader;
    }

    public void setBinaryHeader(String binaryHeader) {
        this.binaryHeader = binaryHeader;
    }
    public List<String> getDestinationAddresses() {
        return destinationAddresses;
    }

    public void setDestinationAddresses(List<String> destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
    }
}
