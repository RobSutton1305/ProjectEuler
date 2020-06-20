package tools.numbers.types

import org.junit.Test

class FibonacciNumberTypeTest extends GroovyTestCase {

    private String STRING

    @Override
    void setUp()  {
        super.setUp()
        this.STRING = "13"
    }

    /* Test print method */
    @Test
    void testFibonacciNumberType_print_withInteger() {
        assert new FibonacciNumberType(new Integer(this.STRING)).print() == "Integer : " + this.STRING
    }
    @Test
    void testFibonacciNumberType_print_withLong() {
        assert new FibonacciNumberType(new Long(this.STRING)).print() == "Long : " + this.STRING
    }
    @Test
    void testFibonacciNumberType_print_withBigInteger() {
        assert new FibonacciNumberType(new BigInteger(this.STRING)).print() == "BigInteger : " + this.STRING
    }

}