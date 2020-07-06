package tools.numbers.types
/*
    Project Euler - PalindromeNumberTypeTest - Created by Rob Sutton on 03/07/2020
*/

class PalindromeNumberTypeTest extends GroovyTestCase {

    private final String VALUE = "906609"
    private final Boolean EXPECTED_ANSWER = true

    /* Test isValid method */
    void testPalindromeNumberType_isValid_withInteger() {
        assert new PalindromeNumberType(new Integer(this.VALUE)).isValid() <=> this.EXPECTED_ANSWER == 0
    }
    void testPalindromeNumberType_isValid_withLong() {
        assert new PalindromeNumberType(new Long(this.VALUE)).isValid() <=> this.EXPECTED_ANSWER == 0
    }
    void testPalindromeNumberType_isValid_withBigInteger() {
        assert new PalindromeNumberType(new BigInteger(this.VALUE)).isValid() <=> this.EXPECTED_ANSWER == 0
    }

    /* Test print method */
    void testPalindromeNumberType_print_withInteger() {
        assert new PalindromeNumberType(new Integer(this.VALUE)).print(false) == "CLASS:Integer VALUE:" + this.VALUE + " isValid:" + new PalindromeNumberType(new Integer(this.VALUE)).isValid()
    }
    void testPalindromeNumberType_print_withLong() {
        assert new PalindromeNumberType(new Long(this.VALUE)).print(false) == "CLASS:Long VALUE:" + this.VALUE + " isValid:" + new PalindromeNumberType(new Long(this.VALUE)).isValid()
    }
    void testPalindromeNumberType_print_withBigInteger() {
        assert new PalindromeNumberType(new BigInteger(this.VALUE)).print(false) == "CLASS:BigInteger VALUE:" + this.VALUE + " isValid:" + new PalindromeNumberType(new BigInteger(this.VALUE)).isValid()
    }

}
