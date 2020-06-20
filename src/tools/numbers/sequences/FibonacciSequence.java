package tools.numbers.sequences;

import org.codehaus.groovy.runtime.typehandling.BigIntegerMath;
import org.codehaus.groovy.runtime.typehandling.IntegerMath;
import org.codehaus.groovy.runtime.typehandling.LongMath;
import tools.numbers.types.FibonacciNumberType;
import java.math.BigInteger;

public class FibonacciSequence extends NumberSequence {

    /**
        Max for Integer is 46 --> 1836311903 (45) if LIMIT method is used
        Max for Long is 92    --> 7540113804746346429 (91)
     */

    /* Public Constructor */
    public FibonacciSequence(String NUMBER_CLASS) {
        super(NUMBER_CLASS);
    }
    /* Private Constructor - Used to return Initial Values */
    private FibonacciSequence(String NUMBER_CLASS, @SuppressWarnings("SameParameterValue") Boolean GET_INITIAL_VALUES) {
        super(NUMBER_CLASS, GET_INITIAL_VALUES);
    }

    /* Define Initial Values Here */
    protected FibonacciSequence setInitialValues_Integer(){
        FibonacciSequence Initial_Values = new FibonacciSequence("Integer", false);
        Initial_Values.add(new FibonacciNumberType(1));
        Initial_Values.add(new FibonacciNumberType(1));
        return Initial_Values;
    }
    protected FibonacciSequence setInitialValues_Long(){
        FibonacciSequence Initial_Values = new FibonacciSequence("Long", false);
        Initial_Values.add(new FibonacciNumberType(1L));
        Initial_Values.add(new FibonacciNumberType(1L));
        return Initial_Values;
    }
    protected FibonacciSequence setInitialValues_BigInteger(){
        FibonacciSequence Initial_Values = new FibonacciSequence("BigInteger", false);
        Initial_Values.add(new FibonacciNumberType(BigInteger.ONE));
        Initial_Values.add(new FibonacciNumberType(BigInteger.ONE));
        return Initial_Values;
    }

    // Generate Next Value
    protected FibonacciNumberType generateNext_Integer(){
        return new FibonacciNumberType((Integer) IntegerMath.add(this.get(this.size()-1).VALUE,this.get(this.size()-2).VALUE) );
    }
    protected FibonacciNumberType generateNext_Long(){
        return new FibonacciNumberType((Long) LongMath.add(this.get(this.size()-1).VALUE,this.get(this.size()-2).VALUE) );
    }
    protected FibonacciNumberType generateNext_BigInteger(){
        return new FibonacciNumberType((BigInteger) BigIntegerMath.add(this.get(this.size()-1).VALUE,this.get(this.size()-2).VALUE) );
    }

}
