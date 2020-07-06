package tools.numbers.divisors
/*
    Project Euler - DivisorsTest - Created by Rob Sutton on 03/07/2020
*/

import static tools.numbers.divisors.Divisors.countDivisors

class DivisorsTest extends GroovyTestCase {

    private final String INPUT = "76576500"
    private final String EXPECTED_ANSWER = "576"
    private Integer stringValue
    private Long longValue
    private BigInteger bigIntegerValue

    void setUp()  {
        super.setUp()
        stringValue = new Integer(this.INPUT)
        longValue = new Long(this.INPUT)
        bigIntegerValue = new BigInteger(this.INPUT)
    }

    /* Test the countDivisors Method */
    void testCountDivisors_withInteger() {
        assert countDivisors(stringValue).toString() == EXPECTED_ANSWER
    }
    void testCountDivisors_withLong() {
        assert countDivisors(longValue).toString() == EXPECTED_ANSWER
    }
    void testCountDivisors_withBigInteger() {
        assert countDivisors(bigIntegerValue).toString() == EXPECTED_ANSWER
    }
}
