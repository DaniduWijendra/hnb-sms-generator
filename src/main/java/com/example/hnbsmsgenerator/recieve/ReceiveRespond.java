package com.example.hnbsmsgenerator.recieve;

import javax.validation.constraints.NotBlank;

public class ReceiveRespond {
    @NotBlank
    private String statusCode;
    @NotBlank
    private String statusDetail;

    public ReceiveRespond(String statusCode,String statusDetail) {
        this.statusCode = statusCode;
        this.statusDetail = statusDetail;
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
