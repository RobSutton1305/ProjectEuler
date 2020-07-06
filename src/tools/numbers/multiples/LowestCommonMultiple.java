package tools.numbers.multiples;
/*
    Project Euler - LowestCommonMultiple - Created by Rob Sutton on 03/07/2020
*/

import tools.numbers.primes.PrimeFactorization;
import tools.numbers.types.NumberType;
import java.math.BigInteger;

// TODO THIS
public class LowestCommonMultiple {

    private final BigInteger BigIntegerRepresentation;

    // prime array TODO
    // prime exponents TODO

    public LowestCommonMultiple(){
        this.BigIntegerRepresentation = BigInteger.ZERO;
    }

    public void add(PrimeFactorization PrimeFactorization){
        // TODO
        for (NumberType PrimeFactor : PrimeFactorization){
            // process PrimeFactor
            System.out.println("");
        }
    }

    public String toString(){
        return this.BigIntegerRepresentation.toString();
    }
}
