package tools.numbers.sequences;

import tools.numbers.types.NumberType;
import java.math.BigInteger;
import java.util.LinkedList;

public abstract class NumberSequence extends LinkedList<NumberType> implements Iterable<NumberType>{

    public final String NUMBER_CLASS;

    /* Public Constructor*/
    public NumberSequence(String NUMBER_CLASS){
        this(NUMBER_CLASS, true);
    }

    /* Private Constructor for Initialising Values */
    protected NumberSequence(String NUMBER_CLASS, Boolean GET_INITIAL_VALUES){
        super();
        this.NUMBER_CLASS = NUMBER_CLASS;
        if (GET_INITIAL_VALUES){
            this.addAll(setInitialValues());
        }
    }

    /* Creates the initial values. */
    protected NumberSequence setInitialValues(){
        if(this.NUMBER_CLASS.equals("Integer")) {
            return setInitialValues_Integer();
        }
        if(this.NUMBER_CLASS.equals("Long")) {
            return setInitialValues_Long();
        }
        if(this.NUMBER_CLASS.equals("BigInteger")) {
             return setInitialValues_BigInteger();
        }
        return null;
    }
    protected NumberSequence setInitialValues_Integer(){
        return null;
    }
    protected NumberSequence setInitialValues_Long(){
        return null;
    }
    protected NumberSequence setInitialValues_BigInteger(){
        return null;
    }

    /* Used to generate the next value. */
    public void generateNext(){
        if(this.NUMBER_CLASS.equals("Integer")) {
            this.add(generateNext_Integer());
        }
        if(this.NUMBER_CLASS.equals("Long")) {
            this.add(generateNext_Long());
        }
        if(this.NUMBER_CLASS.equals("BigInteger")) {
            this.add(generateNext_BigInteger());
        }
    }
    protected NumberType generateNext_Integer(){
        return null;
    }
    protected NumberType generateNext_Long(){
        return null;
    }
    protected NumberType generateNext_BigInteger(){
        return null;
    }

    /* This finds the first N values then stops. */
    public void generateUpToNthIndex(int N){
        while(this.size() < N){
            generateNext();
        }
    }

    /* This finds a value greater than LIMIT then stops. */
    public void generateUpToLimit(String LIMIT){
        // Iterate until we have gone far enough.
        while(new BigInteger(this.getLast().toString()).compareTo(new BigInteger(LIMIT)) < 0){
            generateNext();
        }
    }

    /* Calls NumberType.print() for each value in the sequence */
    public void printSequence(){
        this.forEach(NumberType::print);
    }



}
