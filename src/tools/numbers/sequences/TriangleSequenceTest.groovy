package tools.numbers.sequences
/*
    Project Euler - TriangleSequenceTest - Created by Rob Sutton on 03/07/2020
*/

class TriangleSequenceTest extends GroovyTestCase {

    private final Integer INDEX = 44
    private final String VALUE_AT_INDEX = "990"
    private final String LIMIT = "1000"
    private final String VALUE_BEFORE_LIMIT = "990"
    private final String VALUE_AFTER_LIMIT = "1035"

    /* Testing generateUpToNthIndex and getNthElementAsString */
    void testTriangleSequence_getNthValue_withInteger() {
        NumberSequence numberSequence = new TriangleSequence("Integer")
        numberSequence.generateUpToNthIndex(this.INDEX)
        assert numberSequence.getLast().valueToString() == this.VALUE_AT_INDEX
    }
    void testTriangleSequence_getNthValue_withLong() {
        NumberSequence numberSequence = new TriangleSequence("Long")
        numberSequence.generateUpToNthIndex(this.INDEX)
        assert numberSequence.getLast().valueToString() == this.VALUE_AT_INDEX
    }
    void testTriangleSequence_getNthValue_withBigInteger() {
        NumberSequence numberSequence = new TriangleSequence("BigInteger")
        numberSequence.generateUpToNthIndex(this.INDEX)
        assert numberSequence.getLast().valueToString() == this.VALUE_AT_INDEX
    }

    /* Testing generateUpToLimit and getElementAtLimitAsString */
    void testTriangleSequence_iterateUpToLimit_withInteger() {
        NumberSequence numberSequence = new TriangleSequence("Integer")
        numberSequence.generateUpToLimit(this.LIMIT)
        assert numberSequence.getElementAtLimitAsString(this.LIMIT,false) == this.VALUE_BEFORE_LIMIT
        assert numberSequence.getElementAtLimitAsString(this.LIMIT,true) == this.VALUE_AFTER_LIMIT
    }
    void testTriangleSequence_iterateUpToLimit_withLong() {
        NumberSequence numberSequence = new TriangleSequence("Long")
        numberSequence.generateUpToLimit(this.LIMIT)
        assert numberSequence.getElementAtLimitAsString(this.LIMIT,false) == this.VALUE_BEFORE_LIMIT
        assert numberSequence.getElementAtLimitAsString(this.LIMIT,true) == this.VALUE_AFTER_LIMIT
    }
    void testTriangleSequence_iterateUpToLimit_withBigInteger() {
        NumberSequence numberSequence = new TriangleSequence("BigInteger")
        numberSequence.generateUpToLimit(this.LIMIT)
        assert numberSequence.getElementAtLimitAsString(this.LIMIT,false) == this.VALUE_BEFORE_LIMIT
        assert numberSequence.getElementAtLimitAsString(this.LIMIT,true) == this.VALUE_AFTER_LIMIT
    }

    /* Testing printSequence */
    void testTriangleSequence_printSequence_withInteger() {
        NumberSequence numberSequence = new TriangleSequence("Integer")
        assert numberSequence.printSequence(false) == "NumberType{CLASS:Integer VALUE:1} INDEX:1 NthElement:1\n"+"NumberType{CLASS:Integer VALUE:3} INDEX:2 NthElement:3\n"
    }
    void testTriangleSequence_printSequence_withLong() {
        NumberSequence numberSequence = new TriangleSequence("Long")
        assert numberSequence.printSequence(false) == "NumberType{CLASS:Long VALUE:1} INDEX:1 NthElement:1\n"+"NumberType{CLASS:Long VALUE:3} INDEX:2 NthElement:3\n"
    }
    void testTriangleSequence_printSequence_withBigInteger() {
        NumberSequence numberSequence = new TriangleSequence("BigInteger")
        assert numberSequence.printSequence(false) == "NumberType{CLASS:BigInteger VALUE:1} INDEX:1 NthElement:1\n"+"NumberType{CLASS:BigInteger VALUE:3} INDEX:2 NthElement:3\n"
    }

}
