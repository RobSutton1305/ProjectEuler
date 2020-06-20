package tools.numbers.types;

import java.math.BigInteger;

public class TriangleNumberType extends NumberType {

    public TriangleNumberType(Integer VALUE){
        super(VALUE);
    }
    public TriangleNumberType(Long VALUE){
        super(VALUE);
    }
    public TriangleNumberType(BigInteger VALUE){
        super(VALUE);
    }

    @Override
    public String print() {
        /* Print method doesn't need validity check since all Triangle Numbers are generated validly */
        String TEXT = this.NumberClass +" : "+this.toString();
        System.out.println(TEXT);
        return TEXT;
    }

}
