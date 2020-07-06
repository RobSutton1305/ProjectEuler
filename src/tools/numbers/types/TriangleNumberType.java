package tools.numbers.types;
/*
    Project Euler - TriangleNumberType - Created by Rob Sutton on 03/07/2020
*/

import java.math.BigInteger;

public class TriangleNumberType extends NumberType {

    public TriangleNumberType(Integer value){
        super(value);
    }
    public TriangleNumberType(Long value){
        super(value);
    }
    public TriangleNumberType(BigInteger value){
        super(value);
    }

    @Override
    public Boolean isValid() {
        return null;
    }

    @Override
    public String print(Boolean toSystemOut) {
        /* Print method doesn't need validity check since all Triangle Numbers are generated validly */
        String text = "CLASS:"+this.NUMBER_CLASS +" VALUE:"+VALUE.toString();
        if (toSystemOut) System.out.println(text);
        return text;
    }

}
