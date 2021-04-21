package com.example.hnbsmsgenerator.enumarators;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum UssdOperation {
    VALUE1("mo-init"),VALUE2("mo-count"),VALUE3("mt-init"),VALUE4("mt-count"),VALUE5("mt-fin");

    private String text;

    UssdOperation(String text){this.text = text;}

    public String getText(){return this.text;}

    @Override
    public String toString() {
        return text;
    }

    @JsonCreator(mode =  JsonCreator.Mode.DELEGATING)
    public static UssdOperation fromText(String text){
        for(UssdOperation r : UssdOperation.values()){
            if(r.getText().equals(text)){
                return r;
            }
        }
        throw new IllegalArgumentException();
    }
}
