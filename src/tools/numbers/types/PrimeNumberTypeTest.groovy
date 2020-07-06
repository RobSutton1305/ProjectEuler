package tools.numbers.types
/*
    Project Euler - PrimeNumberTypeTest - Created by Rob Sutton on 03/07/2020
*/

class PrimeNumberTypeTest extends GroovyTestCase {

    private final String VALUE = "31"

    /* Test print method */
    void testPrimeNumberType_print_withInteger() {
        assert new PrimeNumberType(new Integer(this.VALUE)).print(false) == "CLASS:Integer VALUE:" + this.VALUE
    }
    void testPrimeNumberType_print_withLong() {
        assert new PrimeNumberType(new Long(this.VALUE)).print(false) == "CLASS:Long VALUE:" + this.VALUE
    }
    void testPrimeNumberType_print_withBigInteger() {
        assert new PrimeNumberType(new BigInteger(this.VALUE)).print(false) == "CLASS:BigInteger VALUE:" + this.VALUE
    }

}