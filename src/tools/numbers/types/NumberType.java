package tools.numbers.types;

import java.math.BigInteger;
import java.util.Iterator;

public abstract class NumberType implements Iterable {

    public final String NumberClass;
    public final Number VALUE;

    public NumberType(Integer VALUE){
        this.NumberClass = "Integer";
        this.VALUE = VALUE;
    }
    public NumberType(Long VALUE){
        this.NumberClass = "Long";
        this.VALUE = VALUE;
    }
    public NumberType(BigInteger VALUE){
        this.NumberClass = "BigInteger";
        this.VALUE = VALUE;
    }

    /* TODO Fix This */
    @Override
    public Iterator<NumberType> iterator() {
        return this.iterator();
    }

    public Boolean isValid(){
        return true;
    }

    /* TODO Check negative number to string */
    public String toString(){
        return VALUE.toString();
    }

    public String print(){
        String TEXT = this.NumberClass +" : "+this.toString() + " valid? "+this.isValid();
        System.out.println(TEXT);
        return TEXT;
    }

}