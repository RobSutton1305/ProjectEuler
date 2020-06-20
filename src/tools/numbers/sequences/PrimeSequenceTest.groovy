package tools.numbers.sequences

import org.junit.Test

class PrimeSequenceTest extends GroovyTestCase {

    @Override
    protected void setUp() {
        super.setUp()
    }

    /* Testing the isPrime method */
    @Test
    void testPrimeSequence_isPrime_withBigInteger() {
        NumberSequence Sequence = new PrimeSequence("BigInteger")
        int countPrimes = 0
        for (int i = 0; i < 1000000; i++){
            if (Sequence.isValid(BigInteger.valueOf(i))) countPrimes++
        }
        assert countPrimes == 78498 // Primes under 1M in half a second.
    }

    /* Testing the print method */
    @Test
    void testPrimeSequence_printSequence_withInteger() {
        NumberSequence Sequence = new PrimeSequence("Integer")
        Sequence.getLast().print()
        assert true
    }
    @Test
    void testPrimeSequence_printSequence_withLong() {
        NumberSequence Sequence = new PrimeSequence("Long")
        Sequence.getLast().print()
        assert true
    }
    @Test
    void testPrimeSequence_printSequence_withBigInteger() {
        NumberSequence Sequence = new PrimeSequence("BigInteger")
        Sequence.getLast().print()
        assert true
    }

}
