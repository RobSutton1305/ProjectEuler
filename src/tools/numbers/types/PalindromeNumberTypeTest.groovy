package tools.numbers.types

class PalindromeNumberTypeTest extends GroovyTestCase {

    private String STRING
    private Boolean EXPECTED_ANSWER

    @Override
    void setUp()  {
        super.setUp()
        this.STRING = "906609"
        this.EXPECTED_ANSWER = true
    }

    /* Test isValid method */
    void testPalindromeNumberType_isValid_withInteger() {
        assert new PalindromeNumberType(new Integer(this.STRING)).isValid() <=> this.EXPECTED_ANSWER == 0
    }
    void testPalindromeNumberType_isValid_withLong() {
        assert new PalindromeNumberType(new Long(this.STRING)).isValid() <=> this.EXPECTED_ANSWER == 0
    }
    void testPalindromeNumberType_isValid_withBigInteger() {
        assert new PalindromeNumberType(new BigInteger(this.STRING)).isValid() <=> this.EXPECTED_ANSWER == 0
    }

    /* Test print method */
    void testPalindromeNumberType_print_withInteger() {
        assert new PalindromeNumberType(new Integer(this.STRING)).print() == "Integer : " + this.STRING + " valid? " + new PalindromeNumberType(new Integer(this.STRING)).isValid()
    }
    void testPalindromeNumberType_print_withLong() {
        assert new PalindromeNumberType(new Long(this.STRING)).print() == "Long : " + this.STRING + " valid? " + new PalindromeNumberType(new Long(this.STRING)).isValid()
    }
    void testPalindromeNumberType_print_withBigInteger() {
        assert new PalindromeNumberType(new BigInteger(this.STRING)).print() == "BigInteger : " + this.STRING + " valid? " + new PalindromeNumberType(new BigInteger(this.STRING)).isValid()
    }

}
