package tools.numbers.types

class TriangleNumberTypeTest extends GroovyTestCase {

    private String STRING

    @Override
    void setUp()  {
        super.setUp()
        this.STRING = "28"
    }

    /* Test print method */
    void testTriangleNumberType_print_withInteger() {
        assert new TriangleNumberType(new Integer(this.STRING)).print() == "Integer : " + this.STRING
    }
    void testTriangleNumberType_print_withLong() {
        assert new TriangleNumberType(new Long(this.STRING)).print() == "Long : " + this.STRING
    }
    void testTriangleNumberType_print_withBigInteger() {
        assert new TriangleNumberType(new BigInteger(this.STRING)).print() == "BigInteger : " + this.STRING
    }

}