package tools.numbers.types;

import java.math.BigInteger;

public class PalindromeNumberType extends NumberType {

    public PalindromeNumberType(Integer VALUE){
        super(VALUE);
    }
    public PalindromeNumberType(Long VALUE){
        super(VALUE);
    }
    public PalindromeNumberType(BigInteger VALUE){
        super(VALUE);
    }

    @Override
    public Boolean isValid() {
        String STRING = this.VALUE.toString();
        for (int i = 0; i < STRING.length() / 2; i++){
            char a = STRING.charAt(i);
            char b = STRING.charAt(STRING.length() - 1 - i);
            if (a!=b) return false;
        }
        return true;
    }
}