package tools.numbers.types;

import java.math.BigInteger;

public class FibonacciNumberType extends NumberType {

    public FibonacciNumberType(Integer VALUE){
        super(VALUE);
    }
    public FibonacciNumberType(Long VALUE){
        super(VALUE);
    }
    public FibonacciNumberType(BigInteger VALUE){
        super(VALUE);
    }

    @Override
    public String print() {
        /* Print method doesn't need validity check since all Fibonacci Numbers are generated validly */
        String TEXT = this.NumberClass +" : "+this.toString();
        System.out.println(TEXT);
        return TEXT;
    }

}