package tools.numbers.sequences

import org.junit.Test

class FibonacciSequenceTest extends GroovyTestCase {

    private Integer INDEX
    private String VALUE, LIMIT

    @Override
    protected void setUp() {
        super.setUp()
        this.LIMIT = "1134903999"
        this.VALUE = "1134903170"
        this.INDEX = 45
    }

    /* Testing the getNthValue method */
    @Test
    void testFibonacciSequence_getNthValue_withInteger() {
        NumberSequence Sequence = new FibonacciSequence("Integer")
        Sequence.iterateUpToNthIndex(this.INDEX)
        assert Sequence.getLast().toString() == this.VALUE
    }
    @Test
    void testFibonacciSequence_getNthValue_withLong() {
        NumberSequence Sequence = new FibonacciSequence("Long")
        Sequence.iterateUpToNthIndex(this.INDEX)
        assert Sequence.getLast().toString() == this.VALUE    }
    @Test
    void testFibonacciSequence_getNthValue_withBigInteger() {
        NumberSequence Sequence = new FibonacciSequence("BigInteger")
        Sequence.iterateUpToNthIndex(this.INDEX)
        assert Sequence.getLast().toString() == this.VALUE
    }

    /* Testing the iterateUpToLimit method */
    @Test
    void testFibonacciSequence_iterateUpToLimit_withInteger() {
        NumberSequence Sequence = new FibonacciSequence("Integer")
        Sequence.iterateUpToLimit(this.LIMIT)
        assert Sequence.get(Sequence.size()-2).toString() == this.VALUE
    }
    @Test
    void testFibonacciSequence_iterateUpToLimit_withLong() {
        NumberSequence Sequence = new FibonacciSequence("Long")
        Sequence.iterateUpToLimit(this.LIMIT)
        assert Sequence.get(Sequence.size()-2).toString() == this.VALUE     }
    @Test
    void testFibonacciSequence_iterateUpToLimit_withBigInteger() {
        NumberSequence Sequence = new FibonacciSequence("BigInteger")
        Sequence.iterateUpToLimit(this.LIMIT)
        assert Sequence.get(Sequence.size()-2).toString() == this.VALUE
    }

    /* Testing the printSequence method */
    @Test
    void testFibonacciSequence_printSequence_withInteger() {
        NumberSequence Sequence = new FibonacciSequence("Integer")
        Sequence.iterateUpToLimit("100")
        Sequence.printSequence()
        assert true
    }
    @Test
    void testFibonacciSequence_printSequence_withLong() {
        NumberSequence Sequence = new FibonacciSequence("Long")
        Sequence.iterateUpToLimit("100")
        Sequence.printSequence()
        assert true
    }
    @Test
    void testFibonacciSequence_printSequence_withBigInteger() {
        NumberSequence Sequence = new FibonacciSequence("BigInteger")
        Sequence.iterateUpToLimit("100")
        Sequence.printSequence()
        assert true
    }

}