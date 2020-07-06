package tools.numbers.sequences;
/*
    Project Euler - NumberSequence - Created by Rob Sutton on 03/07/2020
*/

import org.codehaus.groovy.runtime.typehandling.BigIntegerMath;
import tools.numbers.types.NumberType;

import java.math.BigInteger;
import java.util.LinkedList;

public abstract class NumberSequence extends LinkedList<NumberType> implements Iterable<NumberType>{

    // Supported NumberTypes are "Integer" ""BigInteger" and "Long"
    public final String NUMBER_CLASS;
    // LIMIT can be passed to setInitialValues() method during construction
    protected final String LIMIT;

    /* Constructors
     * Can optionally set LIMIT but its not required for self generating sequences.
     * Its used in Prime since we generate all the primes at once using a sieve
     */
    public NumberSequence(String numberClass){
        this(numberClass, true);
    }
    public NumberSequence(String numberClass, String limit) {
        this(numberClass, limit, true);
    }

    /* Constructors
     * Used internally for generating initial values
     */
    protected NumberSequence(String numberClass, Boolean getInitialValues){
        this.NUMBER_CLASS = numberClass;
        this.LIMIT = "";
        if (getInitialValues){
            this.addAll(setInitialValues());
        }
    }
    protected NumberSequence(String numberClass, String limit, Boolean getInitialValues){
        this.NUMBER_CLASS = numberClass;
        this.LIMIT = limit;
        if (getInitialValues){
            this.addAll(setInitialValues(limit));
        }
    }

    /* Creates the initial values. */
    protected NumberSequence setInitialValues(String limit){
        if(this.NUMBER_CLASS.equals("Integer")) {
            return setInitialValuesInteger(limit);
        }
        if(this.NUMBER_CLASS.equals("Long")) {
            return setInitialValuesLong(limit);
        }
        if(this.NUMBER_CLASS.equals("BigInteger")) {
             return setInitialValuesBigInteger(limit);
        }
        return null;
    }
    protected NumberSequence setInitialValuesInteger(String limit){
        return null;
    }
    protected NumberSequence setInitialValuesLong(String limit){
        return null;
    }
    protected NumberSequence setInitialValuesBigInteger(String limit){
        return null;
    }
    protected NumberSequence setInitialValues(){
        if(this.NUMBER_CLASS.equals("Integer")) {
            return setInitialValuesInteger();
        }
        if(this.NUMBER_CLASS.equals("Long")) {
            return setInitialValuesLong();
        }
        if(this.NUMBER_CLASS.equals("BigInteger")) {
            return setInitialValuesBigInteger();
        }
        return null;
    }
    protected NumberSequence setInitialValuesInteger(){
        return null;
    }
    protected NumberSequence setInitialValuesLong(){
        return null;
    }
    protected NumberSequence setInitialValuesBigInteger(){
        return null;
    }

    /* Used to generate the next value. */
    public void generateNext(){
        if(this.NUMBER_CLASS.equals("Integer")) {
            this.add(generateNextInteger());
        }
        if(this.NUMBER_CLASS.equals("Long")) {
            this.add(generateNextLong());
        }
        if(this.NUMBER_CLASS.equals("BigInteger")) {
            this.add(generateNextBigInteger());
        }
    }
    protected NumberType generateNextInteger(){
        return null;
    }
    protected NumberType generateNextLong(){
        return null;
    }
    protected NumberType generateNextBigInteger(){
        return null;
    }

    /* This finds the first N values then stops. */
    public void generateUpToNthIndex(int indexInSequence){
        while(this.size() < indexInSequence){
            generateNext();
        }
    }

    /* This finds a value greater than limit then stops. */
    public void generateUpToLimit(String limit){
        while(new BigInteger(this.getLast().valueToString()).compareTo(new BigInteger(limit)) < 0){
            generateNext();
        }
    }

    /* getNthElementAsString */
    protected String getNthElementAsString(int indexInSequence){
        int indexInLinkedList = indexInSequence - 1;
        return this.get(indexInLinkedList).valueToString();
    }
    protected String getElementAtLimitAsString(String limit, Boolean afterLimit){
        BigInteger bigLimit = new BigInteger(limit);
        String lastPrimeToString = "";
        for (NumberType currentPrime : this){
            BigInteger bigCurrentPrime = new BigInteger(currentPrime.valueToString());
            if (BigIntegerMath.compareTo(bigCurrentPrime, bigLimit) < 0){
                lastPrimeToString = currentPrime.valueToString();
            } else {
                if (afterLimit) return currentPrime.valueToString();
                return lastPrimeToString;
            }
        }
        return "0"; // limit larger than biggest prime
    }

    /* Print to System.out */
    public String printSequence(Boolean toSystemOut) {
        StringBuilder textOutput = new StringBuilder();
        for (int indexInSequence = 1; indexInSequence <= this.size(); indexInSequence++) {
            textOutput.append(this.printSequence(indexInSequence, toSystemOut));
        }
        return textOutput.toString();
    }

    public String printSequence(int indexInSequence, Boolean toSystemOut){
        int indexInLinkedList = indexInSequence - 1;
        String sequenceElementToString = "NumberType{" + this.get(indexInLinkedList).print(false) + "}" +
                " INDEX:" +
                indexInSequence +
                " NthElement:" +
                this.getNthElementAsString(indexInSequence) +
                "\n";
        if (toSystemOut) System.out.println(sequenceElementToString);
        return sequenceElementToString;
    }

}
