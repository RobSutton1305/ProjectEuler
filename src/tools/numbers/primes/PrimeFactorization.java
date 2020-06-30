package tools.numbers.primes;

import tools.numbers.sequences.PrimeSequence;
import tools.numbers.types.NumberType;
import java.math.BigInteger;
import java.util.LinkedList;

public class PrimeFactorization extends PrimeSequence {

    private final LinkedList<Integer> EXPONENTS;

    public PrimeFactorization(String NUMBER_CLASS) {
        super(NUMBER_CLASS);
        this.EXPONENTS = new LinkedList<>();
        this.setInitialExponents();
    }

    private void setInitialExponents(){
        for (NumberType N : this){
            this.EXPONENTS.add(1);
        }
    }

    @Override
    public void printSequence() {
        this.forEach(NumberType::print);
    }

    /* TODO - Do these belong here? */
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