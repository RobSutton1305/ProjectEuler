package tools.numbers.sequences;

import org.codehaus.groovy.runtime.typehandling.BigIntegerMath;
import org.codehaus.groovy.runtime.typehandling.IntegerMath;
import org.codehaus.groovy.runtime.typehandling.LongMath;
import tools.numbers.type.FibonacciNumberType;
import tools.numbers.type.NumberType;

import java.math.BigInteger;

public class FibonacciSequence extends NumberSequence {

    /**
        Max for Integer is 46 --> 1836311903 (45) if LIMIT method is used
        Max for Long is 92    --> 7540113804746346429 (91)
     */
    public FibonacciSequence(Class CLASS) {
        super(CLASS);
    }
    // Used only for Initial Values
    private FibonacciSequence(NumberType Initial_Number) {
        super(Initial_Number);
    }


    // Generate Initial Values (as many as you like)
    protected FibonacciSequence generateInitialValues_Integer(){
        FibonacciSequence Initial_Values = new FibonacciSequence(new NumberType(1));
        Initial_Values.add(new NumberType(1));
        return Initial_Values;
    }
    protected FibonacciSequence generateInitialValues_Long(){
        FibonacciSequence Initial_Values = new FibonacciSequence(new NumberType(1L));
        Initial_Values.add(new NumberType(1L));
        return Initial_Values;
    }
    protected FibonacciSequence generateInitialValues_BigInteger(){
        FibonacciSequence Initial_Values = new FibonacciSequence(new NumberType(BigInteger.ONE));
        Initial_Values.add(new NumberType(BigInteger.ONE));
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
