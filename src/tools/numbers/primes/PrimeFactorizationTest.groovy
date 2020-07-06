package tools.numbers.primes
/*
    Project Euler - PrimeFactorizationTest - Created by Rob Sutton on 03/07/2020
*/

import static PrimeFactorization.findLargestPrimeFactor

class PrimeFactorizationTest extends GroovyTestCase {

    private final String INPUT = "1543798"
    private final String BIT_SET_LIMIT = "800000" // TODO-sub optimal method requires this to be n instead of squareRoot(n)
    private final String PRINT_SEQUENCE = "Prime Factorisation of 1543798: 2^1 771899^1 "
    private final String LARGEST_PRIME_FACTOR = "771899"

    void testPrimeFactorization_printSequence(){
        assert new PrimeFactorization(this.INPUT,this.BIT_SET_LIMIT).printSequence(false) == PRINT_SEQUENCE
    }

    void testFindLargestPrimeFactor_withInteger() {
        assert findLargestPrimeFactor(new Integer(INPUT)).toString() == LARGEST_PRIME_FACTOR
    }

    void testFindLargestPrimeFactor_withLong() {
        assert findLargestPrimeFactor(new Long(INPUT)).toString() == LARGEST_PRIME_FACTOR
    }

    void testFindLargestPrimeFactor_withBigInteger() {
        assert findLargestPrimeFactor(new BigInteger(INPUT)).toString() == LARGEST_PRIME_FACTOR
    }
}
