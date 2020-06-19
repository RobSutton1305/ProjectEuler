package tools.numbers.type;

import java.math.BigInteger;
import java.util.Iterator;

public class NumberType implements Iterable {

    public final Class CLASS;
    public final Number VALUE;

    public NumberType(Integer VALUE){
        this.CLASS = Integer.class;
        this.VALUE = VALUE;
    }
    public NumberType(Long VALUE){
        this.CLASS = Long.class;
        this.VALUE = VALUE;
    }
    public NumberType(BigInteger VALUE){
        this.CLASS = BigInteger.class;
        this.VALUE = VALUE;
    }

    @Override
    public Iterator<NumberType> iterator() {
        return this.iterator();
    }

}