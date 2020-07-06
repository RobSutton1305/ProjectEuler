package tools.numbers.types
/*
    Project Euler - FibonacciNumberTypeTest - Created by Rob Sutton on 03/07/2020
*/

class FibonacciNumberTypeTest extends GroovyTestCase {

    private final String VALUE = "13"

    /* Test print method */
    void testFibonacciNumberType_print_withInteger() {
        assert new FibonacciNumberType(new Integer(this.VALUE)).print(false) == "CLASS:Integer VALUE:" + this.VALUE
    }
    void testFibonacciNumberType_print_withLong() {
        assert new FibonacciNumberType(new Long(this.VALUE)).print(false) == "CLASS:Long VALUE:" + this.VALUE
    }
    void testFibonacciNumberType_print_withBigInteger() {
        assert new FibonacciNumberType(new BigInteger(this.VALUE)).print(false) == "CLASS:BigInteger VALUE:" + this.VALUE
    }

}