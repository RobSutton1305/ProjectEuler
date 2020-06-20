package tools.numbers.types;

import java.math.BigInteger;

public class PrimeNumberType extends NumberType {

    public PrimeNumberType(Integer VALUE) {
        super(VALUE);
    }
    public PrimeNumberType(Long VALUE) {
        super(VALUE);
    }
    public PrimeNumberType(BigInteger VALUE) {
        super(VALUE);
    }

    @Override
    public String print() {
        /* Print method doesn't need validity check since all Prime Numbers are generated validly */
        String TEXT = this.NumberClass +" : "+this.toString();
        System.out.println(TEXT);
        return TEXT;
    }


}
