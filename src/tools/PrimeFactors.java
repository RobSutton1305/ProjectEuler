package tools;

import java.math.BigInteger;

public abstract class PrimeFactors {

    /* Returns the largest prime factor of a Long, Integer or BigInteger */
    public static Long findLargestPrimeFactor(long n){
        long p = n;
        for (long i = 2; i < n; i++){
            if (n % i == 0){
                p = n/i;
                break;
            }
        }
        if ( p == n ){ return n; }
        else { return findLargestPrimeFactor(p); }
    }
    public static Integer findLargestPrimeFactor(int n){
        int p = n;
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                p = n/i;
                break;
            }
        }
        if ( p == n ){ return n; }
        else { return findLargestPrimeFactor(p); }
    }
    public static BigInteger findLargestPrimeFactor(BigInteger n){
        BigInteger p = new BigInteger(n.toString());
        BigInteger i = BigInteger.TWO;
        while( i.compareTo(n) < 0){
            if (n.mod(i).equals(BigInteger.ZERO)){
                p = n.divide(i);
                break;
            }
            i=i.add(BigInteger.ONE);
        }
        if ( p.compareTo(n) == 0 ){ return n; }
        else { return findLargestPrimeFactor(p); }
    }

}
