package com.ifTricky;

public class Integer {
    private java.lang.Integer integer;

    public Integer(java.lang.Integer integer) {
        this.integer = integer;
    }

    public String toString(){
        integer++;
        return integer.toString();
    }

    public boolean equals(java.lang.Integer integerCompared){
        integer++;
        return integer == integerCompared;
    }
}
