package com.example.hnbsmsgenerator.ussd;

import javax.validation.constraints.NotBlank;

public class SendResponse {
    @NotBlank
    private String version;
    @NotBlank
    private String requestId;
    @NotBlank
    private String timeStamp;
    @NotBlank
    private String statusCode;
    @NotBlank
    private String statusDetail;

    public SendResponse(@NotBlank String version, @NotBlank String requestId, @NotBlank String timeStamp, @NotBlank String statusCode, @NotBlank String statusDetail) {
        this.version = version;
        this.requestId = requestId;
        this.timeStamp = timeStamp;
        this.statusCode = statusCode;
        this.statusDetail = statusDetail;
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

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
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
}
