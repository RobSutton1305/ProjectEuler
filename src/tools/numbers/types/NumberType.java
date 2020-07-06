package tools.numbers.types;
/*
    Project Euler - NumberType - Created by Rob Sutton on 03/07/2020
*/

import java.math.BigInteger;
/* TODO - Implement Generics and make decision on weird NumberType thing*/
public abstract class NumberType {

    protected final String NUMBER_CLASS;
    public final Number VALUE;

    public NumberType(Integer value){
        this.NUMBER_CLASS = "Integer";
        this.VALUE = value;
    }
    public NumberType(Long value){
        this.NUMBER_CLASS = "Long";
        this.VALUE = value;
    }
    public NumberType(BigInteger value){
        this.NUMBER_CLASS = "BigInteger";
        this.VALUE = value;
    }

    protected abstract Boolean isValid();

    /* Return and Print */
    public String print(Boolean toSystemOut){
        String text = "CLASS:"+this.NUMBER_CLASS +" VALUE:"+valueToString() + " isValid:"+this.isValid();
        if (toSystemOut) System.out.println(text);
        return text;
    }

    /* Get Numeric Value as String*/
    public String valueToString(){
        return this.VALUE.toString();
    }

}