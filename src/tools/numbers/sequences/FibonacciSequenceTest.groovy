package tools.numbers.sequences

import org.junit.Test

import static tools.numbers.primes.PrimeFactors.findLargestPrimeFactor

class FibonacciSequenceTest extends GroovyTestCase {

    private Integer INDEX
    private String VALUE
    private BigInteger LIMIT

    @Override
    protected void setUp() throws Exception {
        super.setUp()
        this.LIMIT = new BigInteger("1134903999")
        this.VALUE = "1134903170"
        this.INDEX = 45
    }

    // Testing Nth Value
    @Test
    void testFibonacciSequence_getNthValue_withInteger() {
        assert new FibonacciSequence(Integer.class).getNthEntry(this.INDEX).VALUE.toString() == this.VALUE
    }
    @Test
    void testFibonacciSequence_getNthValue_withLong() {
        assert new FibonacciSequence(Long.class).getNthEntry(this.INDEX).VALUE.toString() == this.VALUE
    }
    @Test
    void testFibonacciSequence_getNthValue_withBigInteger() {
        assert new FibonacciSequence(BigInteger.class).getNthEntry(this.INDEX).VALUE.toString() == this.VALUE
    }

    // Testing up to LIMIT
    @Test
    void testFibonacciSequence_iterateUpToLimit_withInteger() {
        assert new FibonacciSequence(Integer.class).iterateUpToLimit(this.LIMIT).VALUE.toString() == this.VALUE

    }
    @Test
    void testFibonacciSequence_iterateUpToLimit_withLong() {
        assert new FibonacciSequence(Long.class).iterateUpToLimit(this.LIMIT).VALUE.toString() == this.VALUE
    }
    @Test
    void testFibonacciSequence_iterateUpToLimit_withBigInteger() {
        assert new FibonacciSequence(BigInteger.class).iterateUpToLimit(this.LIMIT).VALUE.toString() == this.VALUE
    }
}
