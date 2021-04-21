package com.example.hnbsmsgenerator.deliverystatus;

import com.example.hnbsmsgenerator.enumarators.DeliveryStatus;

import javax.validation.constraints.NotBlank;

public class DeliveryStatusRequest {
    @NotBlank
    private String destinationAddress;
    @NotBlank
    private String timeStamp;
    @NotBlank
    private String requestId;
    private DeliveryStatus deliveryStatus;

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
