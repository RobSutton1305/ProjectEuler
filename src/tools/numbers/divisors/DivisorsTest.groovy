package tools.numbers.divisors

import static tools.numbers.divisors.Divisors.countDivisors

class DivisorsTest extends GroovyTestCase {

    private final String INPUT = "76576500"
    private final String EXPECTED_ANSWER = "576"
    private Integer N
    private Long L
    private BigInteger B

    void setUp()  {
        super.setUp()
        N = new Integer(this.INPUT)
        L = new Long(this.INPUT)
        B = new BigInteger(this.INPUT)
    }

    /* Test the countDivisors Method */
    void testCountDivisors_withInteger() {
        assert countDivisors(N).toString() == EXPECTED_ANSWER
    }
    void testCountDivisors_withLong() {
        assert countDivisors(L).toString() == EXPECTED_ANSWER
    }
    void testCountDivisors_withBigInteger() {
        assert countDivisors(B).toString() == EXPECTED_ANSWER
    }
}
