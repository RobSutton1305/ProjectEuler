package tools.numbers.types;
/*
    Project Euler - FibonacciNumberType - Created by Rob Sutton on 03/07/2020
*/

import java.math.BigInteger;

public class FibonacciNumberType extends NumberType {

    public FibonacciNumberType(Integer value){
        super(value);
    }
    public FibonacciNumberType(Long value){
        super(value);
    }
    public FibonacciNumberType(BigInteger value){
        super(value);
    }

    /* All Fibonacci numbers are generated validly, return true*/
    @Override
    public Boolean isValid() {
        return true;
    }

    /* Print and Return */
    @Override
    public String print(Boolean toSystemOut) {
        String text = "CLASS:"+this.NUMBER_CLASS +" VALUE:"+this.VALUE;
        if (toSystemOut) System.out.println(text);
        return text;
    }

}