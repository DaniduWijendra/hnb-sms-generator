package com.example.hnbsmsgenerator.sent;

import javax.validation.constraints.NotBlank;
import java.util.List;

public class SmsRespond {
    @NotBlank
    private String statusCode;
    @NotBlank
    private String statusDetail;
    @NotBlank
    private String requestId;
    @NotBlank
    private String version;
    private List<AddressEntry> destinationResponses;

    public SmsRespond() {
    }

    public SmsRespond(String statusCode, String statusDetail, String requestId, String version, List<AddressEntry> destinationResponses) {
        this.statusCode = statusCode;
        this.statusDetail = statusDetail;
        this.requestId = requestId;
        this.version = version;
        this.destinationResponses = destinationResponses;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    public List<AddressEntry> getDestinationResponses() {
        return destinationResponses;
    }

    public void setDestinationResponses(List<AddressEntry> destinationResponses) {
        this.destinationResponses = destinationResponses;
    }

    @Override
    public String toString() {
        return "SmsRespond{" +
                "statusCode='" + statusCode + '\'' +
                ", statusDetail='" + statusDetail + '\'' +
                ", requestId='" + requestId + '\'' +
                ", version='" + version + '\'' +
                ", destinationResponses=" + destinationResponses +
                '}';
    }
}
