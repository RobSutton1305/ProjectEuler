package tools.numbers.sequences
/*
    Project Euler - FibonacciSequenceTest - Created by Rob Sutton on 03/07/2020
*/

class FibonacciSequenceTest extends GroovyTestCase {

    private final Integer INDEX = 45
    private final String VALUE_AT_INDEX = "1134903170"
    private final String LIMIT = "1234567890"
    private final String VALUE_BEFORE_LIMIT = "1134903170"
    private final String VALUE_AFTER_LIMIT = "1836311903"

    /* Testing generateUpToNthIndex and getNthElementAsString */
    void testFibonacciSequence_getNthValue_withInteger() {
        NumberSequence numberSequence = new FibonacciSequence("Integer")
        numberSequence.generateUpToNthIndex(this.INDEX)
        assert numberSequence.getNthElementAsString(this.INDEX) == this.VALUE_AT_INDEX
    }
    void testFibonacciSequence_getNthValue_withLong() {
        NumberSequence numberSequence = new FibonacciSequence("Long")
        numberSequence.generateUpToNthIndex(this.INDEX)
        assert numberSequence.getNthElementAsString(this.INDEX) == this.VALUE_AT_INDEX
    }
    void testFibonacciSequence_getNthValue_withBigInteger() {
        NumberSequence numberSequence = new FibonacciSequence("BigInteger")
        numberSequence.generateUpToNthIndex(this.INDEX)
        assert numberSequence.getNthElementAsString(this.INDEX) == this.VALUE_AT_INDEX
    }

    /* Testing generateUpToLimit and getElementAtLimitAsString */
    void testFibonacciSequence_iterateUpToLimit_withInteger() {
        NumberSequence numberSequence = new FibonacciSequence("Integer")
        numberSequence.generateUpToLimit(this.LIMIT)
        assert numberSequence.getElementAtLimitAsString(this.LIMIT,false) == this.VALUE_BEFORE_LIMIT
        assert numberSequence.getElementAtLimitAsString(this.LIMIT,true) == this.VALUE_AFTER_LIMIT
    }
    void testFibonacciSequence_iterateUpToLimit_withLong() {
        NumberSequence numberSequence = new FibonacciSequence("Long")
        numberSequence.generateUpToLimit(this.LIMIT)
        assert numberSequence.getElementAtLimitAsString(this.LIMIT,false) == this.VALUE_BEFORE_LIMIT
        assert numberSequence.getElementAtLimitAsString(this.LIMIT,true) == this.VALUE_AFTER_LIMIT
    }
    void testFibonacciSequence_iterateUpToLimit_withBigInteger() {
        NumberSequence numberSequence = new FibonacciSequence("BigInteger")
        numberSequence.generateUpToLimit(this.LIMIT)
        assert numberSequence.getElementAtLimitAsString(this.LIMIT,false) == this.VALUE_BEFORE_LIMIT
        assert numberSequence.getElementAtLimitAsString(this.LIMIT,true) == this.VALUE_AFTER_LIMIT
    }

    /* Testing printSequence */
    void testFibonacciSequence_printSequence_withInteger() {
        NumberSequence numberSequence = new FibonacciSequence("Integer")
        assert numberSequence.printSequence(false) == "NumberType{CLASS:Integer VALUE:1} INDEX:1 NthElement:1\n"+"NumberType{CLASS:Integer VALUE:1} INDEX:2 NthElement:1\n"
    }
    void testFibonacciSequence_printSequence_withLong() {
        NumberSequence numberSequence = new FibonacciSequence("Long")
        assert numberSequence.printSequence(false) == "NumberType{CLASS:Long VALUE:1} INDEX:1 NthElement:1\n"+"NumberType{CLASS:Long VALUE:1} INDEX:2 NthElement:1\n"
    }
    void testFibonacciSequence_printSequence_withBigInteger() {
        NumberSequence numberSequence = new FibonacciSequence("BigInteger")
        assert numberSequence.printSequence(false) == "NumberType{CLASS:BigInteger VALUE:1} INDEX:1 NthElement:1\n"+"NumberType{CLASS:BigInteger VALUE:1} INDEX:2 NthElement:1\n"
    }

}