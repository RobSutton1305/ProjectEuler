package tools.numbers.primes;

import java.math.BigInteger;

public abstract class PrimeFactors {

    /* Returns the largest prime factor of a Long, Integer or BigInteger */
    public static Long findLargestPrimeFactor(long n) {
        Long result;
        long p = n;
        for (long i = 2; i < n; i++) {
            if (n % i == 0) {
                p = n / i;
                break;
            }
        }
        if (p == n) {
            result = n;
        } else {
            result = findLargestPrimeFactor(p);
        }
        return result;
    }
    public static Integer findLargestPrimeFactor(int n) {
        Integer result;
        int p = n;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                p = n / i;
                break;
            }
        }
        if (p == n) {
            result = n;
        } else {
            result = findLargestPrimeFactor(p);
        }
        return result;
    }
    public static BigInteger findLargestPrimeFactor(BigInteger n) {
        BigInteger result;
        BigInteger p = new BigInteger(n.toString());
        BigInteger i = BigInteger.TWO;
        while (i.compareTo(n) < 0) {
            if (n.mod(i).equals(BigInteger.ZERO)) {
                p = n.divide(i);
                break;
            }
            i = i.add(BigInteger.ONE);
        }
        if (p.compareTo(n) == 0) {
            result = n;
        } else {
            result = findLargestPrimeFactor(p);
        }
        return result;
    }

}
