package tools.numbers.sequences;

import org.codehaus.groovy.runtime.typehandling.BigIntegerMath;
import org.codehaus.groovy.runtime.typehandling.IntegerMath;
import org.codehaus.groovy.runtime.typehandling.LongMath;
import tools.numbers.type.NumberType;
import tools.numbers.type.TriangleNumberType;
import java.math.BigInteger;

public class TriangleSequence extends NumberSequence {

    /**
     Max for Integer is 65535 --> 2147450880
     */

    public TriangleSequence(Class CLASS) {
        super(CLASS);
    }
    // Used only for Initial Values
    private TriangleSequence(NumberType Initial_Number) {
        super(Initial_Number);
    }

    // Generate Initial Values (as many as you like)
    protected TriangleSequence generateInitialValues_Integer(){
        TriangleSequence Initial_Values = new TriangleSequence(new NumberType(1));
        Initial_Values.add(new NumberType(3));
        return Initial_Values;
    }
    protected TriangleSequence generateInitialValues_Long(){
        TriangleSequence Initial_Values = new TriangleSequence(new NumberType(1L));
        Initial_Values.add(new NumberType(3L));
        return Initial_Values;
    }
    protected TriangleSequence generateInitialValues_BigInteger(){
        TriangleSequence Initial_Values = new TriangleSequence(new NumberType(BigInteger.ONE));
        Initial_Values.add(new NumberType(new BigInteger("3")));
        return Initial_Values;
    }

    // Generate Next Value
    protected TriangleNumberType generateNext_Integer(){
        return new TriangleNumberType((Integer) IntegerMath.add(this.getLast().VALUE,this.size()+1) );
    }
    protected TriangleNumberType generateNext_Long(){
        return new TriangleNumberType((Long) LongMath.add(this.getLast().VALUE,this.size()+1) );
    }
    protected TriangleNumberType generateNext_BigInteger(){
        return new TriangleNumberType((BigInteger) BigIntegerMath.add(this.getLast().VALUE,this.size()+1) );
    }

}
