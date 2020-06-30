package tools.numbers.primes

import static PrimeFactorization.findLargestPrimeFactor

class PrimeFactorizationTest extends GroovyTestCase {

    private final String INPUT = "60084753"
    private final String EXPECTED_ANSWER = "1187"
    private Integer N
    private Long L
    private BigInteger B

    void setUp()  {
        super.setUp()
        N = new Integer(INPUT)
        L = new Long(INPUT)
        B = new BigInteger(INPUT)
    }

    void tearDown() {
        super.tearDown()
    }

    void testFindLargestPrimeFactor_withInteger() {
        assert findLargestPrimeFactor((Integer)N).toString() == EXPECTED_ANSWER
    }

    void testFindLargestPrimeFactor_withLong() {
        assert findLargestPrimeFactor((Long)L).toString() == EXPECTED_ANSWER
    }

    void testFindLargestPrimeFactor_withBigInteger() {
        assert findLargestPrimeFactor((BigInteger)B).toString() == EXPECTED_ANSWER
    }
}
