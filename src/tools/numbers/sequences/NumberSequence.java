package tools.numbers.sequences;

import tools.numbers.type.NumberType;

import java.math.BigInteger;
import java.util.LinkedList;

public abstract class NumberSequence extends LinkedList<NumberType> {

    public final Class CLASS;

    public NumberSequence(Class CLASS) {
        super();
        this.CLASS = CLASS;
        setInitialValues(generateInitialValues());
    }

    // This is used for initial values only
    protected NumberSequence(NumberType NumberType){
        super();
        this.CLASS = NumberType.CLASS;
        this.addFirst(NumberType);
    }

    // Initial Values
    protected void setInitialValues(NumberSequence InitialValues) {
        this.addAll(InitialValues);
    }
    protected NumberSequence generateInitialValues(){
        if(this.CLASS == Integer.class) {
            return generateInitialValues_Integer();
        }
        if(this.CLASS == Long.class) {
            return generateInitialValues_Long();
        }
        if(this.CLASS == BigInteger.class) {
             return generateInitialValues_BigInteger();
        }
        return null;
    }
    protected NumberSequence generateInitialValues_Integer(){
        return null;
    }
    protected NumberSequence generateInitialValues_Long(){
        return null;
    }
    protected NumberSequence generateInitialValues_BigInteger(){
        return null;
    }


    // Generate Next Values
    protected void generateNext(){
        if(this.CLASS == Integer.class) {
            this.add(generateNext_Integer());
        }
        if(this.CLASS == Long.class) {
            this.add(generateNext_Long());
        }
        if(this.CLASS == BigInteger.class) {
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


    // Iteration Methods
    public NumberType getNthEntry(int N){
        // Return if we already know it.
        if (N <= this.size()){ return this.get(N); }
        // Iterate until we have gone far enough.
        while(this.size() < N){
            generateNext();
        }
        return this.get(N-1);
    }
    public NumberType iterateUpToLimit(BigInteger LIMIT){
        // Iterate until we have gone far enough.
        while(new BigInteger(this.getLast().VALUE.toString()).compareTo(LIMIT) < 0){
            generateNext();
        }
        return this.get(this.size()-2);
    }

    // Other Methods
    public void print(){
        this.forEach( (element) -> System.out.println( element.VALUE ));
    }

}
