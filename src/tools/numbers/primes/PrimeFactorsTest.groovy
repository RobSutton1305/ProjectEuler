package tools.numbers.primes

import org.junit.Test
import static tools.numbers.primes.PrimeFactors.findLargestPrimeFactor

class PrimeFactorsTest extends GroovyTestCase {

    private final String INPUT = "60084753"
    private final String EXPECTED_ANSWER = "1187"
    private Integer N
    private Long L
    private BigInteger B

    @Override
    void setUp()  {
        super.setUp()
        N = new Integer(INPUT)
        L = new Long(INPUT)
        B = new BigInteger(INPUT)
    }

    @Override
    void tearDown() {
        super.tearDown()
    }

    @Test
    void testFindLargestPrimeFactor_withInteger() {
        assert findLargestPrimeFactor((Integer)N).toString() == EXPECTED_ANSWER
    }

    @Test
    void testFindLargestPrimeFactor_withLong() {
        assert findLargestPrimeFactor((Long)L).toString() == EXPECTED_ANSWER
    }

    @Test
    void testFindLargestPrimeFactor_withBigInteger() {
        assert findLargestPrimeFactor((BigInteger)B).toString() == EXPECTED_ANSWER
    }
}
