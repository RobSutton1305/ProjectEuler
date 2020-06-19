package tools.numbers.divisors;

import org.codehaus.groovy.runtime.typehandling.BigIntegerMath;

import java.math.BigInteger;

public class Divisors {

    public static Integer countDivisors(int n){
        int count = 0;
        for (int i = 1; i*i <= n; i++)
            if (n % i == 0) {
                count += 2;   // Each factor has a friend > squareRoot(tri)
                if (n / i == i) {
                    count--;
                } // Already counted is square number.
            }
        return count;
    }
    public static Long countDivisors(long l){
        long count = 0;
        for (long i = 1L; i*i <= l; i++)
            if (l % i == 0L) {
                count += 2L;   // Each factor has a friend > squareRoot(tri)
                if (l / i == i) {
                    count--;
                } // Already counted is square number.
            }
        return count;
    }
    public static BigInteger countDivisors(BigInteger B){
        BigInteger count = BigInteger.ZERO;
        for (BigInteger i = BigInteger.ONE; BigIntegerMath.compareTo( BigIntegerMath.multiply(i,i),B) <= 0; i = i.add(BigInteger.ONE))
            if (BigIntegerMath.compareTo(BigIntegerMath.mod(B,i),0) == 0 ){
                count = count.add(BigInteger.TWO);   // Each factor has a friend > squareRoot(tri)
                if ( BigIntegerMath.compareTo(BigIntegerMath.multiply(i,i),B) == 0) {
                    count = count.subtract(BigInteger.ONE);
                } // Already counted is square number.
            }
        return count;
    }

}
