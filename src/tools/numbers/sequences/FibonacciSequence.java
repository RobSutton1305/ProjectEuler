package tools.numbers.sequences;
/*
    Project Euler - FibonacciSequence - Created by Rob Sutton on 03/07/2020
*/

import org.codehaus.groovy.runtime.typehandling.BigIntegerMath;
import org.codehaus.groovy.runtime.typehandling.IntegerMath;
import org.codehaus.groovy.runtime.typehandling.LongMath;
import tools.numbers.types.FibonacciNumberType;
import java.math.BigInteger;

public class FibonacciSequence extends NumberSequence {

    /* Public Constructor */
    public FibonacciSequence(String numberClass) {
        super(numberClass);
    }
    /* Private Constructor - Used to return Initial Values */
    private FibonacciSequence(String numberClass , Boolean getInitialValues) {
        super(numberClass, getInitialValues);
    }

    /* Define initial values */
    protected FibonacciSequence setInitialValuesInteger(){
        FibonacciSequence initialValues = new FibonacciSequence("Integer", false);
        initialValues.add(new FibonacciNumberType(1));
        initialValues.add(new FibonacciNumberType(1));
        return initialValues;
    }
    protected FibonacciSequence setInitialValuesLong(){
        FibonacciSequence initialValues = new FibonacciSequence("Long", false);
        initialValues.add(new FibonacciNumberType(1L));
        initialValues.add(new FibonacciNumberType(1L));
        return initialValues;
    }
    protected FibonacciSequence setInitialValuesBigInteger(){
        FibonacciSequence initialValues = new FibonacciSequence("BigInteger", false);
        initialValues.add(new FibonacciNumberType(BigInteger.ONE));
        initialValues.add(new FibonacciNumberType(BigInteger.ONE));
        return initialValues;
    }

    /* Generate the next value */
    protected FibonacciNumberType generateNextInteger(){
        return new FibonacciNumberType((Integer) IntegerMath.add(this.getLast().VALUE,this.get(this.size()-2).VALUE) );
    }
    protected FibonacciNumberType generateNextLong(){
        return new FibonacciNumberType((Long) LongMath.add(this.getLast().VALUE,this.get(this.size()-2).VALUE) );
    }
    protected FibonacciNumberType generateNextBigInteger(){
        return new FibonacciNumberType((BigInteger) BigIntegerMath.add(this.getLast().VALUE,this.get(this.size()-2).VALUE) );
    }

}
