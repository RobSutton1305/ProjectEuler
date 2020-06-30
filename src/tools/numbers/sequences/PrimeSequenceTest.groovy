package tools.numbers.sequences

class PrimeSequenceTest extends GroovyTestCase {

    private Integer INDEX
    private String VALUE, LIMIT

    @Override
    protected void setUp() {
        super.setUp()
        this.LIMIT = "104744"
        this.VALUE = "104743"
        this.INDEX = 10001
    }

    /* TODO other types -Testing the isPrime method */
    void testPrimeSequence_isPrime_withBigInteger() {
        NumberSequence Sequence = new PrimeSequence("BigInteger")
        int countPrimes = 0
        for (int i = 0; i < 1000000; i++){
            if (Sequence.isValid(BigInteger.valueOf(i))) countPrimes++
        }
        assert countPrimes == 78498 // Primes under 1M in half a second.
    }

    /* Testing the getNthValue method */
    void testPrimeSequence_getNthValue_withInteger() {
        NumberSequence Sequence = new PrimeSequence("Integer")
        Sequence.generateUpToNthIndex(this.INDEX)
        assert Sequence.get(this.INDEX-1).toString() == this.VALUE
    }
    void testPrimeSequence_getNthValue_withLong() {
        NumberSequence Sequence = new PrimeSequence("Long")
        Sequence.generateUpToNthIndex(this.INDEX)
        assert Sequence.get(this.INDEX-1).toString() == this.VALUE
    }
    void testPrimeSequence_getNthValue_withBigInteger() {
        NumberSequence Sequence = new PrimeSequence("BigInteger")
        Sequence.generateUpToNthIndex(this.INDEX)
        assert Sequence.get(this.INDEX-1).toString() == this.VALUE
    }

    /* Testing the iterateUpToLimit method */
    void testPrimeSequence_iterateUpToLimit_withInteger() {
        NumberSequence Sequence = new PrimeSequence("Integer")
        Sequence.generateUpToLimit(this.LIMIT)   // THIS FAILS CURRENTLY TODO - Fix - Prime.genNext doesn't work.
        assert Sequence.get(Sequence.size()-2).toString() == this.VALUE
    }
    void testPrimeSequence_iterateUpToLimit_withLong() {
        NumberSequence Sequence = new PrimeSequence("Long")
        Sequence.generateUpToLimit(this.LIMIT)
        assert Sequence.get(Sequence.size()-2).toString() == this.VALUE     }
    void testPrimeSequence_iterateUpToLimit_withBigInteger() {
        NumberSequence Sequence = new PrimeSequence("BigInteger")
        Sequence.generateUpToLimit(this.LIMIT)
        assert Sequence.get(Sequence.size()-2).toString() == this.VALUE
    }

    /* Testing the print method */
    void testPrimeSequence_printSequence_withInteger() {
        NumberSequence Sequence = new PrimeSequence("Integer")
        Sequence.getLast().print()
        assert true
    }
    void testPrimeSequence_printSequence_withLong() {
        NumberSequence Sequence = new PrimeSequence("Long")
        Sequence.getLast().print()
        assert true
    }
    void testPrimeSequence_printSequence_withBigInteger() {
        NumberSequence Sequence = new PrimeSequence("BigInteger")
        Sequence.getLast().print()
        assert true
    }

}
