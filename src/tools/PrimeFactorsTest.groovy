package tools

import org.junit.Test

import static tools.PrimeFactors.findLargestPrimeFactor

class PrimeFactorsTest extends GroovyTestCase {

    private final String VALUE = "60084753"
    private final String ANSWER = "1187"
    private Integer N
    private Long L
    private BigInteger B

    @Override
    void setUp()  {
        super.setUp()
        N = new Integer(VALUE)
        L = new Long(VALUE)
        B = new BigInteger(VALUE)
    }

    @Override
    void tearDown() {
        super.tearDown()
    }

    @Test
    void testFindLargestPrimeFactor_withInteger() {
        assert findLargestPrimeFactor((Integer)N).toString() == ANSWER
    }

    @Test
    void testFindLargestPrimeFactor_withLong() {
        assert findLargestPrimeFactor((Long)L).toString() == ANSWER
    }

    @Test
    void testFindLargestPrimeFactor_withBigInteger() {
        assert findLargestPrimeFactor((BigInteger)B).toString() == ANSWER
    }
}
