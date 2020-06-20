package tools.numbers.sequences

import org.junit.Test

class TriangleSequenceTest extends GroovyTestCase {

    private Integer INDEX
    private String VALUE, LIMIT

    @Override
    protected void setUp() {
        super.setUp()
        this.LIMIT = "1000"
        this.VALUE = "990"
        this.INDEX = 44
    }

    /* Testing the getNthValue method */
    @Test
    void testTriangleSequence_getNthValue_withInteger() {
        NumberSequence Sequence = new TriangleSequence("Integer")
        Sequence.iterateUpToNthIndex(this.INDEX)
        assert Sequence.getLast().toString() == this.VALUE
    }
    @Test
    void testTriangleSequence_getNthValue_withLong() {
        NumberSequence Sequence = new TriangleSequence("Long")
        Sequence.iterateUpToNthIndex(this.INDEX)
        assert Sequence.getLast().toString() == this.VALUE
    }
    @Test
    void testTriangleSequence_getNthValue_withBigInteger() {
        NumberSequence Sequence = new TriangleSequence("BigInteger")
        Sequence.iterateUpToNthIndex(this.INDEX)
        assert Sequence.getLast().toString() == this.VALUE
    }

    /* Testing the iterateUpToLimit method */
    @Test
    void testTriangleSequence_iterateUpToLimit_withInteger() {
        NumberSequence Sequence = new TriangleSequence("Integer")
        Sequence.iterateUpToLimit(this.LIMIT)
        assert Sequence.get(Sequence.size()-2).toString() == this.VALUE
    }
    @Test
    void testTriangleSequence_iterateUpToLimit_withLong() {
        NumberSequence Sequence = new TriangleSequence("Long")
        Sequence.iterateUpToLimit(this.LIMIT)
        assert Sequence.get(Sequence.size()-2).toString() == this.VALUE     }
    @Test
    void testTriangleSequence_iterateUpToLimit_withBigInteger() {
        NumberSequence Sequence = new TriangleSequence("BigInteger")
        Sequence.iterateUpToLimit(this.LIMIT)
        assert Sequence.get(Sequence.size()-2).toString() == this.VALUE
    }

    /* Testing the printSequence method */
    @Test
    void testTriangleSequence_printSequence_withInteger() {
        NumberSequence Sequence = new TriangleSequence("Integer")
        Sequence.iterateUpToLimit("100")
        Sequence.printSequence()
        assert true
    }
    @Test
    void testTriangleSequence_printSequence_withLong() {
        NumberSequence Sequence = new TriangleSequence("Long")
        Sequence.iterateUpToLimit("100")
        Sequence.printSequence()
        assert true
    }
    @Test
    void testTriangleSequence_printSequence_withBigInteger() {
        NumberSequence Sequence = new TriangleSequence("BigInteger")
        Sequence.iterateUpToLimit("100")
        Sequence.printSequence()
        assert true
    }

}
