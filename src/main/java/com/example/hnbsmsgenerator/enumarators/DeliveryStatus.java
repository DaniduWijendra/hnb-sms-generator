package com.example.hnbsmsgenerator.enumarators;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum DeliveryStatus {
    VALUE1("DELIVERED"),VALUE2("EXPIRED"),VALUE3("DELETED"),VALUE4("UNDELIVERABLE"),
    VALUE5("ACCEPTED"),VALUE6("UNKNOWN"),VALUE7("REJECTED");

    private String text;

    DeliveryStatus(String text){this.text = text;}

    public String getText(){return this.text;}

    @Override
    public String toString() {
        return text ;
    }
    @JsonCreator(mode =  JsonCreator.Mode.DELEGATING)
    public static DeliveryStatus fromText(String text){
        for(DeliveryStatus r : DeliveryStatus.values()){
            if(r.getText().equals(text)){
                return r;
            }
        }
        throw new IllegalArgumentException();
    }
}
