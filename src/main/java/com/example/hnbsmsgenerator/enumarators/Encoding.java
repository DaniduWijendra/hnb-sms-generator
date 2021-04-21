package com.example.hnbsmsgenerator.enumarators;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Encoding {
    VALUE1("0"),VALUE2("240"),VALUE3("245"),VALUE4("440");

    private String text;

    Encoding(String text){this.text = text;}

    public String getText(){return this.text;}

    @Override
    public String toString() {
        return text;
    }

    @JsonCreator(mode =  JsonCreator.Mode.DELEGATING)
    public static Encoding fromText(String text){
        for(Encoding r : Encoding.values()){
            if(r.getText().equals(text)){
                return r;
            }
        }
        throw new IllegalArgumentException();
    }
}
