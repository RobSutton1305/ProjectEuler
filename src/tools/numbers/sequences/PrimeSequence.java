package tools.numbers.sequences;

import org.codehaus.groovy.runtime.typehandling.BigIntegerMath;
import tools.numbers.types.PrimeNumberType;
import java.math.BigInteger;
import java.util.BitSet;

/**
 * PrimeSequence Object used for generating sequential Primes.
 */
public class PrimeSequence extends NumberSequence {

    private BitSet PrimeBits;
    private final int BitSetLIMIT = 1000000; // TODO - Set this via constructor to avoid bullshit

    /* Public Constructor */
    public PrimeSequence(String NUMBER_CLASS) {
        super(NUMBER_CLASS);
    }

    /* Private Constructor - Used to return Initial Values */
    private PrimeSequence(String NUMBER_CLASS, @SuppressWarnings("SameParameterValue") Boolean GET_INITIAL_VALUES) {
        super(NUMBER_CLASS, GET_INITIAL_VALUES);
    }

    /* Define Initial Values Here */
    protected PrimeSequence setInitialValues_Integer() {
        PrimeSequence Initial_Values = new PrimeSequence("Integer", false);
        Initial_Values.add(new PrimeNumberType(2));
        this.PrimeBits = new BitSet(this.BitSetLIMIT);
        this.genPrimes();
        for(int i = 3; i < this.BitSetLIMIT; i +=2){
            if (PrimeBits.get(i)) {
                Initial_Values.add(new PrimeNumberType(i));
            }
        }
        return Initial_Values;
    }
    protected PrimeSequence setInitialValues_Long() {
        PrimeSequence Initial_Values = new PrimeSequence("Long", false);
        Initial_Values.add(new PrimeNumberType(2L));
        this.PrimeBits = new BitSet(this.BitSetLIMIT);
        this.genPrimes();
        for(int i = 3; i < this.BitSetLIMIT; i +=2){
            if (PrimeBits.get(i)) {
                Initial_Values.add(new PrimeNumberType(Long.valueOf(i)));
            }
        }
        return Initial_Values;
    }
    protected PrimeSequence setInitialValues_BigInteger() {
        PrimeSequence Initial_Values = new PrimeSequence("BigInteger", false);
        Initial_Values.add(new PrimeNumberType(BigInteger.TWO));
        this.PrimeBits = new BitSet(this.BitSetLIMIT);
        this.genPrimes();
        for(int i = 3; i < this.BitSetLIMIT; i +=2){
            if (PrimeBits.get(i)) {
                Initial_Values.add(new PrimeNumberType(BigInteger.valueOf(i)));
            }
        }
        return Initial_Values;
    }

    /* BitSet used to sieve primes */
    private void genPrimes(){
        // default at true = prime
        for (int p = 0; p < this.BitSetLIMIT; p++) this.PrimeBits.flip(p);
        this.PrimeBits.flip(0);
        this.PrimeBits.flip(1);
        for (int i = 2; i < this.BitSetLIMIT; i++) {
            if (this.PrimeBits.get(i)) {
                for (int j = 2 * i; j < this.BitSetLIMIT; j += i) {
                    this.PrimeBits.set(j, false); // set all multiples of primes as not prime
                }
            }
        }
    }


    /* TODO - Long and Integer versions */
    public Boolean isValid(BigInteger B) {
        // Return false if B < 2
        if (BigIntegerMath.compareTo(B,BigInteger.TWO) < 0) return false;
        // Return using BitSet value if B < BitSetLIMIT
        if (BigIntegerMath.compareTo(B, new BigInteger(Integer.toString(this.BitSetLIMIT))) < 0){
            return this.PrimeBits.get(Integer.parseInt(B.toString()));
        }
        // If B is bigger than the square of the largest previously found prime, we cannot guarantee a result
        if (BigIntegerMath.compareTo( B,  BigIntegerMath.multiply(new BigInteger(Integer.toString(this.BitSetLIMIT)), new BigInteger(Integer.toString(this.BitSetLIMIT)))) > 0){
            System.out.println("WARNING : input ("+B.toString()+") is too large. Increase BitSet size or risk IndexOutOfBoundsException");
        }
        // Otherwise
        if (BigIntegerMath.compareTo(BigIntegerMath.mod(B,BigInteger.valueOf(6)), BigInteger.ONE) != 0 && BigIntegerMath.compareTo(BigIntegerMath.mod(B , BigInteger.valueOf(6)), BigInteger.valueOf(5)) != 0) {
            return false;
        }
        for (int i = 0; BigIntegerMath.compareTo(BigIntegerMath.multiply( new BigInteger(this.get(i).toString()), new BigInteger(this.get(i).toString())), B) <= 0; i++) {
            if (BigIntegerMath.compareTo(BigIntegerMath.mod(B, new BigInteger(this.get(i).toString())), BigInteger.ZERO) == 0) {
                return false;
            }
        }
        return true;
    }

    /* Generate Next Prime - TODO
     *
     * The isValid method checks bigger primes but doesn't add them this List
     * The primes would be out of order unless they are isValid checks in increasing magnitude.
     * This method should be called to find them in the right order so we can add them to the list as we go
     *
     *
     * I stole this from Primes before deleting it.
     *     public int nextPrime(int p){
     *         do p += 2; while (isPrime(p));
     *         return p;
     *     }
     *     // Check if n is prime
     *     public boolean isPrime(int n) {
     *         for (int i = 0; primeArray[i] * primeArray[i] <= n; i++) {
     *             if (n % 6 != 1 && n % 6 != 5) { // this looks like it can be taken outside the for loop
     *                 return false;
     *             }
     *             if (n % primeArray[i] == 0) {
     *                 return false;
     *             }
     *         }
     *         return true;
     *     }
     *
     */

    protected PrimeNumberType generateNext_Integer() {
        return null;
    }
    protected PrimeNumberType generateNext_Long() {
        return null;
    }
    protected PrimeNumberType generateNext_BigInteger() {
        return null;
    }

}