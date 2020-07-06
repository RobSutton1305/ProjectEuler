package tools.numbers.sequences;
/*
    Project Euler - TriangleSequence - Created by Rob Sutton on 03/07/2020
*/

import org.codehaus.groovy.runtime.typehandling.BigIntegerMath;
import org.codehaus.groovy.runtime.typehandling.IntegerMath;
import org.codehaus.groovy.runtime.typehandling.LongMath;
import tools.numbers.types.TriangleNumberType;
import java.math.BigInteger;

public class TriangleSequence extends NumberSequence {

    /* Public Constructor */
    public TriangleSequence(String numberClass) {
        super(numberClass);
    }
    /* Private Constructor - Used to return Initial Values */
    private TriangleSequence(String numberClass, Boolean getInitialValues) {
        super(numberClass, getInitialValues);
    }

    /* Define Initial Values Here */
    protected TriangleSequence setInitialValuesInteger(){
        TriangleSequence initialValues = new TriangleSequence("Integer", false);
        initialValues.add(new TriangleNumberType(1));
        initialValues.add(new TriangleNumberType(3));
        return initialValues;
    }
    protected TriangleSequence setInitialValuesLong(){
        TriangleSequence initialValues = new TriangleSequence("Long", false);
        initialValues.add(new TriangleNumberType(1L));
        initialValues.add(new TriangleNumberType(3L));
        return initialValues;
    }
    protected TriangleSequence setInitialValuesBigInteger(){
        TriangleSequence initialValues = new TriangleSequence("BigInteger", false);
        initialValues.add(new TriangleNumberType(BigInteger.ONE));
        initialValues.add(new TriangleNumberType(new BigInteger("3")));
        return initialValues;
    }

    // Generate Next Value
    protected TriangleNumberType generateNextInteger(){
        return new TriangleNumberType((Integer) IntegerMath.add(this.getLast().VALUE,this.size()+1) );
    }
    protected TriangleNumberType generateNextLong(){
        return new TriangleNumberType((Long) LongMath.add(this.getLast().VALUE,this.size()+1) );
    }
    protected TriangleNumberType generateNextBigInteger(){
        return new TriangleNumberType((BigInteger) BigIntegerMath.add(this.getLast().VALUE,this.size()+1) );
    }

}
