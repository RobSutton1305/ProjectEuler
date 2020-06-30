package tools.numbers.types

class PrimeNumberTypeTest extends GroovyTestCase {

    private String STRING

    @Override
    void setUp()  {
        super.setUp()
        this.STRING = "31"
    }

    /* Test print method */
    void testPrimeNumberType_print_withInteger() {
        assert new PrimeNumberType(new Integer(this.STRING)).print() == "Integer : " + this.STRING
    }
    void testTrPrimeNumberType_print_withLong() {
        assert new PrimeNumberType(new Long(this.STRING)).print() == "Long : " + this.STRING
    }
    void testPrimeNumberType_print_withBigInteger() {
        assert new PrimeNumberType(new BigInteger(this.STRING)).print() == "BigInteger : " + this.STRING
    }

}