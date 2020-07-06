package tools.numbers.types
/*
    Project Euler - TriangleNumberTypeTest - Created by Rob Sutton on 03/07/2020
*/

class TriangleNumberTypeTest extends GroovyTestCase {

    private final String VALUE = "28"

    /* Test print method */
    void testTriangleNumberType_print_withInteger() {
        assert new TriangleNumberType(new Integer(this.VALUE)).print(false) == "CLASS:Integer VALUE:" + this.VALUE
    }
    void testTriangleNumberType_print_withLong() {
        assert new TriangleNumberType(new Long(this.VALUE)).print(false) == "CLASS:Long VALUE:" + this.VALUE
    }
    void testTriangleNumberType_print_withBigInteger() {
        assert new TriangleNumberType(new BigInteger(this.VALUE)).print(false) == "CLASS:BigInteger VALUE:" + this.VALUE
    }

}