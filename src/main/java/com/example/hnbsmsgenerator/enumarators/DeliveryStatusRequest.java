package com.example.hnbsmsgenerator.enumarators;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum DeliveryStatusRequest {
    VALUE1("0"),VALUE2("1");

    private String text;

    DeliveryStatusRequest(String text){this.text = text;}

    public String getText(){return this.text;}

    @Override
    public String toString() {
        return text ;
    }
    @JsonCreator(mode =  JsonCreator.Mode.DELEGATING)
    public static DeliveryStatusRequest fromText(String text){
        for(DeliveryStatusRequest r : DeliveryStatusRequest.values()){
            if(r.getText().equals(text)){
                return r;
            }
        }
        throw new IllegalArgumentException();
    }
}
