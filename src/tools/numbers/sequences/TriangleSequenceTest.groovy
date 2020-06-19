package tools.numbers.sequences

import org.junit.Test

class TriangleSequenceTest extends GroovyTestCase {

    private Integer INDEX
    private String VALUE
    private BigInteger LIMIT

    @Override
    protected void setUp() throws Exception {
        super.setUp()
        this.LIMIT = new BigInteger("1000")
        this.VALUE = "990"
        this.INDEX = 44
    }

    // Testing Nth Value
    @Test
    void testTriangleSequence_getNthValue_withInteger() {
        assert new TriangleSequence(Integer.class).iterateUpToNthIndex(this.INDEX).VALUE.toString() == this.VALUE
    }
    @Test
    void testTriangleSequence_getNthValue_withLong() {
        assert new TriangleSequence(Long.class).iterateUpToNthIndex(this.INDEX).VALUE.toString() == this.VALUE
    }
    @Test
    void testTriangleSequence_getNthValue_withBigInteger() {
        assert new TriangleSequence(BigInteger.class).iterateUpToNthIndex(this.INDEX).VALUE.toString() == this.VALUE
    }


    // Testing up to LIMIT
    @Test
    void testTriangleSequence_iterateUpToLimit_withInteger() {
        assert new TriangleSequence(Integer.class).iterateUpToLimit(this.LIMIT).VALUE.toString() == this.VALUE
    }
    @Test
    void testTriangleSequence_iterateUpToLimit_withLong() {
        assert new TriangleSequence(Long.class).iterateUpToLimit(this.LIMIT).VALUE.toString() == this.VALUE
    }
    @Test
    void testTriangleSequence_iterateUpToLimit_withBigInteger() {
        assert new TriangleSequence(BigInteger.class).iterateUpToLimit(this.LIMIT).VALUE.toString() == this.VALUE
    }

}
