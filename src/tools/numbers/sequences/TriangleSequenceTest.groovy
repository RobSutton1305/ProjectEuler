package tools.numbers.sequences

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
    void testTriangleSequence_getNthValue_withInteger() {
        NumberSequence Sequence = new TriangleSequence("Integer")
        Sequence.generateUpToNthIndex(this.INDEX)
        assert Sequence.getLast().toString() == this.VALUE
    }
    void testTriangleSequence_getNthValue_withLong() {
        NumberSequence Sequence = new TriangleSequence("Long")
        Sequence.generateUpToNthIndex(this.INDEX)
        assert Sequence.getLast().toString() == this.VALUE
    }
    void testTriangleSequence_getNthValue_withBigInteger() {
        NumberSequence Sequence = new TriangleSequence("BigInteger")
        Sequence.generateUpToNthIndex(this.INDEX)
        assert Sequence.getLast().toString() == this.VALUE
    }

    /* Testing the iterateUpToLimit method */
    void testTriangleSequence_iterateUpToLimit_withInteger() {
        NumberSequence Sequence = new TriangleSequence("Integer")
        Sequence.generateUpToLimit(this.LIMIT)
        assert Sequence.get(Sequence.size()-2).toString() == this.VALUE
    }
    void testTriangleSequence_iterateUpToLimit_withLong() {
        NumberSequence Sequence = new TriangleSequence("Long")
        Sequence.generateUpToLimit(this.LIMIT)
        assert Sequence.get(Sequence.size()-2).toString() == this.VALUE     }
    void testTriangleSequence_iterateUpToLimit_withBigInteger() {
        NumberSequence Sequence = new TriangleSequence("BigInteger")
        Sequence.generateUpToLimit(this.LIMIT)
        assert Sequence.get(Sequence.size()-2).toString() == this.VALUE
    }

    /* Testing the printSequence method */
    void testTriangleSequence_printSequence_withInteger() {
        NumberSequence Sequence = new TriangleSequence("Integer")
        Sequence.generateUpToLimit("100")
        Sequence.printSequence()
        assert true
    }
    void testTriangleSequence_printSequence_withLong() {
        NumberSequence Sequence = new TriangleSequence("Long")
        Sequence.generateUpToLimit("100")
        Sequence.printSequence()
        assert true
    }
    void testTriangleSequence_printSequence_withBigInteger() {
        NumberSequence Sequence = new TriangleSequence("BigInteger")
        Sequence.generateUpToLimit("100")
        Sequence.printSequence()
        assert true
    }

}
