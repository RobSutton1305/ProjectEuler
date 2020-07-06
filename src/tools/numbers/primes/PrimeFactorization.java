package tools.numbers.primes;
/*
    Project Euler - PrimeFactorization - Created by Rob Sutton on 03/07/2020
*/

import org.codehaus.groovy.runtime.typehandling.BigIntegerMath;
import tools.numbers.sequences.PrimeSequence;
import tools.numbers.types.NumberType;
import java.math.BigInteger;
import java.util.LinkedList;

/* TODO - need to finish implementation
 *  Current support BigInteger only
 */
public class PrimeFactorization extends PrimeSequence {

    private final BigInteger VALUE;
    private final LinkedList<Integer> EXPONENTS;

    public PrimeFactorization(String value, String bitSetLimit) {
        super("BigInteger", bitSetLimit);
        this.VALUE = new BigInteger(value);
        this.EXPONENTS = new LinkedList<>();
        this.setExponents();
    }

    /* TODO - Optimize this */
    private void setExponents(){
        BigInteger bigValue = new BigInteger(this.VALUE.toString());
        for (NumberType primeFactor : this){
            BigInteger bigPrimeFactor = new BigInteger(primeFactor.valueToString());
            // Break when primes factors are larger than squareRoot of this.VALUE
            BigInteger bigPrimeFactorSquared = bigPrimeFactor.multiply(bigPrimeFactor);
            if (bigPrimeFactorSquared.compareTo( bigValue ) > 0) { break; }
            int exponent = 0;
            while (BigIntegerMath.compareTo(BigIntegerMath.mod(bigValue,bigPrimeFactor),BigInteger.ZERO) == 0 ){
                bigValue = bigValue.divide(bigPrimeFactor);
                exponent++;
            }
            this.EXPONENTS.add(exponent);
            // need to can add the prime-pair
            // TODO - figure out best way
        }
    }

    @Override
    public String printSequence(Boolean toSystemOut) {
        StringBuilder primeFactorizationToString = new StringBuilder();
        primeFactorizationToString.append("Prime Factorisation of ").append(this.VALUE).append(": ");
        for (int i = 0; i < this.size(); i++){
            if (this.EXPONENTS.get(i) != 0){
                primeFactorizationToString.append(this.get(i).valueToString()).append("^").append(this.EXPONENTS.get(i)).append(" ");
            }
        }
        if (toSystemOut) System.out.println(primeFactorizationToString);
        return primeFactorizationToString.toString();
    }


    /* Returns the largest prime factor of a Long, Integer or BigInteger */
    public static Integer findLargestPrimeFactor(int n) {
        Integer result;
        int p = n;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                p = n / i;
                break;
            }
        }
        if (p == n) {
            result = n;
        } else {
            result = findLargestPrimeFactor(p);
        }
        return result;
    }
    public static Long findLargestPrimeFactor(long n) {
        Long result;
        long p = n;
        for (long i = 2; i < n; i++) {
            if (n % i == 0) {
                p = n / i;
                break;
            }
        }
        if (p == n) {
            result = n;
        } else {
            result = findLargestPrimeFactor(p);
        }
        return result;
    }
    public static BigInteger findLargestPrimeFactor(BigInteger n) {
        BigInteger result;
        BigInteger p = new BigInteger(n.toString());
        BigInteger i = BigInteger.TWO;
        while (i.compareTo(n) < 0) {
            if (n.mod(i).equals(BigInteger.ZERO)) {
                p = n.divide(i);
                break;
            }
            i = i.add(BigInteger.ONE);
        }
        if (p.compareTo(n) == 0) {
            result = n;
        } else {
            result = findLargestPrimeFactor(p);
        }
        return result;
    }

}