package tools.numbers.sequences
/*
    Project Euler - PrimeSequenceTest - Created by Rob Sutton on 03/07/2020
*/

class PrimeSequenceTest extends GroovyTestCase {

    private final Integer INDEX = 101
    private final String VALUE_AT_INDEX = "547"
    private final String VALUE_BEFORE_LIMIT = "997"
    private final String VALUE_AFTER_LIMIT = "1009"
    private final String LIMIT = "1000"
    private final String BIT_SET_LIMIT = "9000"

    /* Testing isPrime and counting primes under 1 Million - fails by design when bitSetLimit is smaller than bitSetLimit */
    void testIsValid_withInteger() {
        NumberSequence numberSequence = new PrimeSequence("Integer","1000000")
        int countPrimes = 0
        for (int i = 0; i < 1000000; i++){
            if (numberSequence.isValid(i)) countPrimes++
        }
        assert countPrimes == 78498 // Primes under 1M in half a second.
    }
    void testIsValid_withLong() {
        NumberSequence numberSequence = new PrimeSequence("Long","1000000")
        int countPrimes = 0
        for (long l = 0; l < 1000000; l++){
            if (numberSequence.isValid(l)) countPrimes++
        }
        assert countPrimes == 78498 // Primes under 1M in half a second.
    }
    void testIsValid_withBigInteger() {
        NumberSequence numberSequence = new PrimeSequence("BigInteger","1000000")
        int countPrimes = 0
        for (int i = 0; i < 1000000; i++){
            if (numberSequence.isValid(BigInteger.valueOf(i))) countPrimes++
        }
        assert countPrimes == 78498 // Primes under 1M in half a second.
    }

    /* Testing generateUpToNthIndex and getNthElementAsString */
    void testGenerateUpToNthIndex_withInteger() {
        NumberSequence numberSequence = new PrimeSequence("Integer",BIT_SET_LIMIT)
        numberSequence.generateUpToNthIndex(this.INDEX)
        assert numberSequence.getNthElementAsString(this.INDEX) == this.VALUE_AT_INDEX
    }
    void testGenerateUpToNthIndex_withLong() {
        NumberSequence numberSequence = new PrimeSequence("Long",BIT_SET_LIMIT)
        numberSequence.generateUpToNthIndex(this.INDEX)
        assert numberSequence.getNthElementAsString(this.INDEX) == this.VALUE_AT_INDEX
    }
    void testGenerateUpToNthIndex_withBigInteger() {
        NumberSequence numberSequence = new PrimeSequence("BigInteger",BIT_SET_LIMIT)
        numberSequence.generateUpToNthIndex(this.INDEX)
        assert numberSequence.getNthElementAsString(this.INDEX) == this.VALUE_AT_INDEX
    }

    /* Testing generateUpToLimit and getElementAtLimitAsString */
    void testGenerateUpToLimit_withInteger() {
        NumberSequence numberSequence = new PrimeSequence("Integer",BIT_SET_LIMIT)
        numberSequence.generateUpToLimit(this.LIMIT)
        assert numberSequence.getElementAtLimitAsString(this.LIMIT,false) == this.VALUE_BEFORE_LIMIT
        assert numberSequence.getElementAtLimitAsString(this.LIMIT, true) == this.VALUE_AFTER_LIMIT
    }
    void testGenerateUpToLimit_withLong() {
        NumberSequence numberSequence = new PrimeSequence("Long",BIT_SET_LIMIT)
        numberSequence.generateUpToLimit(this.LIMIT)
        assert numberSequence.getElementAtLimitAsString(this.LIMIT,false) == this.VALUE_BEFORE_LIMIT
        assert numberSequence.getElementAtLimitAsString(this.LIMIT,true) == this.VALUE_AFTER_LIMIT
    }
    void testGenerateUpToLimit_withBigInteger() {
        NumberSequence numberSequence = new PrimeSequence("BigInteger",BIT_SET_LIMIT)
        numberSequence.generateUpToLimit(this.LIMIT)
        assert numberSequence.getElementAtLimitAsString(this.LIMIT,false) == this.VALUE_BEFORE_LIMIT
        assert numberSequence.getElementAtLimitAsString(this.LIMIT,true) == this.VALUE_AFTER_LIMIT
    }

    /* Testing the print method */
    void testPrintSequence_withInteger() {
        NumberSequence numberSequence = new PrimeSequence("Integer",BIT_SET_LIMIT)
        assert numberSequence.printSequence(this.INDEX,false) == "NumberType{CLASS:Integer VALUE:"+this.VALUE_AT_INDEX+"} INDEX:"+this.INDEX+" NthElement:"+this.VALUE_AT_INDEX+"\n"
    }
    void testPrintSequence_withLong() {
        NumberSequence numberSequence = new PrimeSequence("Long",BIT_SET_LIMIT)
        assert numberSequence.printSequence(this.INDEX,false) == "NumberType{CLASS:Long VALUE:"+this.VALUE_AT_INDEX+"} INDEX:"+this.INDEX+" NthElement:"+this.VALUE_AT_INDEX+"\n"
    }
    void testPrintSequence_withBigInteger() {
        NumberSequence numberSequence = new PrimeSequence("BigInteger",BIT_SET_LIMIT)
        assert numberSequence.printSequence(this.INDEX,false) == "NumberType{CLASS:BigInteger VALUE:"+this.VALUE_AT_INDEX+"} INDEX:"+this.INDEX+" NthElement:"+this.VALUE_AT_INDEX+"\n"
    }

}
