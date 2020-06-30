package tools.numbers.sequences

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
    void testFibonacciSequence_getNthValue_withInteger() {
        NumberSequence Sequence = new FibonacciSequence("Integer")
        Sequence.generateUpToNthIndex(this.INDEX)
        assert Sequence.getLast().toString() == this.VALUE
    }
    void testFibonacciSequence_getNthValue_withLong() {
        NumberSequence Sequence = new FibonacciSequence("Long")
        Sequence.generateUpToNthIndex(this.INDEX)
        assert Sequence.getLast().toString() == this.VALUE    }
    void testFibonacciSequence_getNthValue_withBigInteger() {
        NumberSequence Sequence = new FibonacciSequence("BigInteger")
        Sequence.generateUpToNthIndex(this.INDEX)
        assert Sequence.getLast().toString() == this.VALUE
    }

    /* Testing the iterateUpToLimit method */
    void testFibonacciSequence_iterateUpToLimit_withInteger() {
        NumberSequence Sequence = new FibonacciSequence("Integer")
        Sequence.generateUpToLimit(this.LIMIT)
        assert Sequence.get(Sequence.size()-2).toString() == this.VALUE
    }
    void testFibonacciSequence_iterateUpToLimit_withLong() {
        NumberSequence Sequence = new FibonacciSequence("Long")
        Sequence.generateUpToLimit(this.LIMIT)
        assert Sequence.get(Sequence.size()-2).toString() == this.VALUE     }
    void testFibonacciSequence_iterateUpToLimit_withBigInteger() {
        NumberSequence Sequence = new FibonacciSequence("BigInteger")
        Sequence.generateUpToLimit(this.LIMIT)
        assert Sequence.get(Sequence.size()-2).toString() == this.VALUE
    }

    /* Testing the printSequence method */
    void testFibonacciSequence_printSequence_withInteger() {
        NumberSequence Sequence = new FibonacciSequence("Integer")
        Sequence.generateUpToLimit("100")
        Sequence.printSequence()
        assert true
    }
    void testFibonacciSequence_printSequence_withLong() {
        NumberSequence Sequence = new FibonacciSequence("Long")
        Sequence.generateUpToLimit("100")
        Sequence.printSequence()
        assert true
    }
    void testFibonacciSequence_printSequence_withBigInteger() {
        NumberSequence Sequence = new FibonacciSequence("BigInteger")
        Sequence.generateUpToLimit("100")
        Sequence.printSequence()
        assert true
    }

}