package tools.numbers.sequences;
/*
    Project Euler - PrimeSequence - Created by Rob Sutton on 03/07/2020
*/

import org.codehaus.groovy.runtime.typehandling.BigIntegerMath;
import tools.LongBitSet;
import tools.numbers.types.NumberType;
import tools.numbers.types.PrimeNumberType;
import java.math.BigInteger;

public class PrimeSequence extends NumberSequence {

    // TODO - Auto assign bitSetLimit based on number input
    protected LongBitSet primeBitSet;

    /* Constructor */
    public PrimeSequence(String numberClass, String bitSetLimit) {
        super(numberClass, bitSetLimit);
    }

    /* Constructor - Used to return Initial Values */
    protected PrimeSequence(String numberClass, String bitSetLimit, Boolean getInitialValues) {
        super(numberClass, bitSetLimit, getInitialValues);
    }

    /* Define the initial values using LongBitSet */
    protected PrimeSequence setInitialValuesInteger(String bitSetLimit) {
        PrimeSequence initialValues = new PrimeSequence("Integer", bitSetLimit,false);
        initialValues.add(new PrimeNumberType(2));
        long longBitSetLimit = Long.parseLong(bitSetLimit);
        this.primeBitSet = new LongBitSet(longBitSetLimit);
        this.genPrimes();
        for(long l = 3L; l < longBitSetLimit; l += 2L){
            if (primeBitSet.get(l)) {
                initialValues.add(new PrimeNumberType(Integer.parseInt(String.valueOf(l))));
            }
        }
        return initialValues;
    }
    protected PrimeSequence setInitialValuesLong(String bitSetLimit) {
        PrimeSequence initialValues = new PrimeSequence("Long", bitSetLimit, false);
        initialValues.add(new PrimeNumberType(2L));
        long longBitSetLimit = Long.parseLong(bitSetLimit);
        this.primeBitSet = new LongBitSet(longBitSetLimit);
        this.genPrimes();
        for(long l = 3L; l < longBitSetLimit; l += 2L){
            if (primeBitSet.get(l)) {
                initialValues.add(new PrimeNumberType(l));
            }
        }
        return initialValues;
    }
    protected PrimeSequence setInitialValuesBigInteger(String bitSetLimit) {
        PrimeSequence initialValues = new PrimeSequence("BigInteger", bitSetLimit, false);
        initialValues.add(new PrimeNumberType(BigInteger.TWO));
        long longBitSetLimit = Long.parseLong(bitSetLimit);
        this.primeBitSet = new LongBitSet(longBitSetLimit);
        this.genPrimes();
        for(long l = 3L; l < longBitSetLimit; l += 2L){
            if (primeBitSet.get(l)) {
                initialValues.add(new PrimeNumberType(new BigInteger(String.valueOf(l))));
            }
        }
        return initialValues;
    }

    /* BitSet used to sieve primes (0 to N-1) */
    private void genPrimes(){
        long longBitSetLimit = Long.parseLong(this.LIMIT);
        this.primeBitSet.set(0,false); // 0 is not a prime
        this.primeBitSet.set(1,false); // 1 is not a prime
        for (long p = 2; p < longBitSetLimit; p++) this.primeBitSet.set(p,true); // set [2,LIMIT) prime
        for (long l = 2; l < longBitSetLimit; l++) {
            if (this.primeBitSet.get(l)) {
                for (long j = 2 * l; j < longBitSetLimit; j += l) {
                    this.primeBitSet.set(j, false); // all multiples of primes as not prime
                }
            }
        }
    }

    /* Checks is a number is prime - used to generateNext */
    protected Boolean isValid(Integer integerValue) {
        long longLimit = Long.parseLong(this.LIMIT);
        long longIntegerValue = Long.parseLong(String.valueOf(integerValue));
        // Return false if integerValue < 2
        if (longIntegerValue < 2) return false;
        // Return using LongBitSet value if possible
        if (longIntegerValue < longLimit && longLimit < Integer.MAX_VALUE){
            return this.primeBitSet.get(longIntegerValue);
        }
        // Magic
        long longIntegerModuloSix = longIntegerValue % 6;
        if (longIntegerModuloSix != 1 && longIntegerModuloSix != 5) {
            return false;
        }
        for (NumberType P : this){
            long l = Long.parseLong(P.valueToString());
            if (l*l > longIntegerValue) break;
            if (longIntegerValue % l == 0) return false;
        }
        return true;
    }
    protected Boolean isValid(Long longValue) {
        long longLimit = Long.parseLong(this.LIMIT);
        // Return false if longValue < 2
        if (longValue < 2) return false;
        // Return using LongBitSet longValue < LIMIT
        if (longValue < longLimit && longLimit < Integer.MAX_VALUE){
            return this.primeBitSet.get(longValue);
        }
        // Magic
        long longIntegerModuloSix = longValue % 6;
        if (longIntegerModuloSix != 1 && longIntegerModuloSix != 5) {
            return false;
        }
        for (NumberType P : this){
            long l = Long.parseLong(P.valueToString());
            if (l*l > longValue) break;
            if (longValue % l == 0) return false;
        }
        return true;
    }
    protected Boolean isValid(BigInteger bigIntegerValue) {
        // Return false if bigIntegerValue < 2
        if (BigIntegerMath.compareTo(bigIntegerValue,BigInteger.TWO) < 0) return false;
        // Return using LongBitSet if bigIntegerValue < LIMIT
        if (BigIntegerMath.compareTo(bigIntegerValue, new BigInteger(this.LIMIT)) < 0){
            return this.primeBitSet.get(Integer.parseInt(bigIntegerValue.toString()));
        }
        // Magic
        if (BigIntegerMath.compareTo(BigIntegerMath.mod(bigIntegerValue,BigInteger.valueOf(6)), BigInteger.ONE) != 0 && BigIntegerMath.compareTo(BigIntegerMath.mod(bigIntegerValue , BigInteger.valueOf(6)), BigInteger.valueOf(5)) != 0) {
            return false;
        }
        for (NumberType P : this){
            BigInteger bigInteger = new BigInteger(P.valueToString());
            if (BigIntegerMath.compareTo(BigIntegerMath.multiply( bigInteger, bigInteger), bigIntegerValue) > 0) break;
            if (BigIntegerMath.compareTo(BigIntegerMath.mod(bigIntegerValue, bigInteger), BigInteger.ZERO) == 0) {
                return false;
            }
        }
        return true;
    }

    /* If BitSet is smaller than required we call this to generate sequential primes */
    protected PrimeNumberType generateNextInteger() {
        int increment = 2;
        while (true){
            int testNumber = Integer.parseInt(this.getLast().valueToString());
            testNumber += increment;
            if (this.isValid(testNumber)){
                return new PrimeNumberType(testNumber);
            }
            increment += 2;
        }
    }
    protected PrimeNumberType generateNextLong() {
        long increment = 2L;
        while (true){
            long testNumber = Long.parseLong(this.getLast().valueToString());
            testNumber += increment;
            if (this.isValid(testNumber)){
                return new PrimeNumberType(testNumber);
            }
            increment += 2L;
        }
    }
    protected PrimeNumberType generateNextBigInteger() {
        BigInteger increment = BigInteger.TWO;
        while (true){
            BigInteger testNumber = new BigInteger(this.getLast().valueToString());
            testNumber = testNumber.add(increment);
            if (this.isValid(testNumber)){
                return new PrimeNumberType(testNumber);
            }
            increment = increment.add(BigInteger.TWO);
        }
    }

}