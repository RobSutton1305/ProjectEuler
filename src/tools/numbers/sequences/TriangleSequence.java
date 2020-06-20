package tools.numbers.sequences;

import org.codehaus.groovy.runtime.typehandling.BigIntegerMath;
import org.codehaus.groovy.runtime.typehandling.IntegerMath;
import org.codehaus.groovy.runtime.typehandling.LongMath;
import tools.numbers.types.TriangleNumberType;
import java.math.BigInteger;

public class TriangleSequence extends NumberSequence {

    /**
        Max for Integer is 65535 --> 2147450880
        Max for Long unknown
     */

    /* Public Constructor */
    public TriangleSequence(String NUMBER_CLASS) {
        super(NUMBER_CLASS);
    }
    /* Private Constructor - Used to return Initial Values */
    private TriangleSequence(String NUMBER_CLASS, @SuppressWarnings("SameParameterValue") Boolean GET_INITIAL_VALUES) {
        super(NUMBER_CLASS, GET_INITIAL_VALUES);
    }

    /* Define Initial Values Here */
    protected TriangleSequence setInitialValues_Integer(){
        TriangleSequence Initial_Values = new TriangleSequence("Integer", false);
        Initial_Values.add(new TriangleNumberType(1));
        Initial_Values.add(new TriangleNumberType(3));
        return Initial_Values;
    }
    protected TriangleSequence setInitialValues_Long(){
        TriangleSequence Initial_Values = new TriangleSequence("Long", false);
        Initial_Values.add(new TriangleNumberType(1L));
        Initial_Values.add(new TriangleNumberType(3L));
        return Initial_Values;
    }
    protected TriangleSequence setInitialValues_BigInteger(){
        TriangleSequence Initial_Values = new TriangleSequence("BigInteger", false);
        Initial_Values.add(new TriangleNumberType(BigInteger.ONE));
        Initial_Values.add(new TriangleNumberType(new BigInteger("3")));
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
