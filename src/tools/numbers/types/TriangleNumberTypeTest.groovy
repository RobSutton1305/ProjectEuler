package tools.numbers.types

import org.junit.Test

class TriangleNumberTypeTest extends GroovyTestCase {

    private String STRING

    @Override
    void setUp()  {
        super.setUp()
        this.STRING = "28"
    }

    /* Test print method */
    @Test
    void testTriangleNumberType_print_withInteger() {
        assert new TriangleNumberType(new Integer(this.STRING)).print() == "Integer : " + this.STRING
    }
    @Test
    void testTriangleNumberType_print_withLong() {
        assert new TriangleNumberType(new Long(this.STRING)).print() == "Long : " + this.STRING
    }
    @Test
    void testTriangleNumberType_print_withBigInteger() {
        assert new TriangleNumberType(new BigInteger(this.STRING)).print() == "BigInteger : " + this.STRING
    }

}