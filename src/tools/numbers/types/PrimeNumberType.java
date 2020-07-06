package tools.numbers.types;
/*
    Project Euler - PrimeNumberType - Created by Rob Sutton on 03/07/2020
*/

import java.math.BigInteger;

public class PrimeNumberType extends NumberType {

    public PrimeNumberType(Integer value) {
        super(value);
    }
    public PrimeNumberType(Long value) {
        super(value);
    }
    public PrimeNumberType(BigInteger value) {
        super(value);
    }

    @Override
    public Boolean isValid() {
        return null;
    }

    @Override
    public String print(Boolean toSystemOut) {
        String text = "CLASS:"+this.NUMBER_CLASS +" VALUE:"+VALUE.toString();
        if (toSystemOut) System.out.println(text);
        return text;
    }


}
