package tools.numbers.types;
/*
    Project Euler - PalindromeNumberType - Created by Rob Sutton on 03/07/2020
*/

import java.math.BigInteger;

public class PalindromeNumberType extends NumberType {

    public PalindromeNumberType(Integer value){
        super(value);
    }
    public PalindromeNumberType(Long value){
        super(value);
    }
    public PalindromeNumberType(BigInteger value){
        super(value);
    }

    @Override
    public Boolean isValid() {
        String s = this.VALUE.toString();
        for (int i = 0; i < s.length() / 2; i++){
            char a = s.charAt(i);
            char b = s.charAt(s.length() - 1 - i);
            if (a!=b) return false;
        }
        return true;
    }

}