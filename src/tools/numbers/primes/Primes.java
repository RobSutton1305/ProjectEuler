package tools.numbers.primes;

import java.util.BitSet;

public class Primes {
    /**
     * TODO - this rest of this class --> PrimeSequence
     *
     * Created by Rob Sutton on 12-Jun-2016.
     *
     * Primes object can return an array of primes up to limit.
     *
     * Can use these to check if n up to limit*limit is prime
     * BitSet is suited to smaller numbers as sieve would need size (limit*limit)
     *
     * getPrimes() returns int[]
     * isPrime(int n) checks if n is a prime
     * nextPrime(n) returns next prime after n
     *
     * static method getPrimesBelow(int n) returns BitSet sieve
     */
    private final int[] primeArray;
    private int primeCount;

    /* Compiles array of primes UP TO n */
    public Primes(int n){
        int[] temp;
        temp = new int[n];
        temp[0] = 2; temp[1] = 3;
        this.primeCount = 2;
        int p = 3;
        while (n > temp[this.primeCount - 1]){
            do p += 2; while (!isPrime(p,temp));
            temp[++this.primeCount -1] = p;
        }
        primeArray = new int[this.primeCount -1];
        System.arraycopy(temp, 0, primeArray, 0, this.primeCount - 1);
    }

    // Used in constructor only.
    private boolean isPrime(int n, int[] temp) {
        boolean result = true;
        for (int i = 0; temp[i] * temp[i] <= n; i++) {
            if (n % 6 != 1 && n % 6 != 5) {
                result = false;
                break;
            }
            if (n % temp[i] == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    /* returns next prime after p */
    public int nextPrime(int p){
        do p += 2; while (isPrime(p));
        return p;
    }

    // Check if n is prime
    public boolean isPrime(int n) {
        for (int i = 0; primeArray[i] * primeArray[i] <= n; i++) {
            if (n % 6 != 1 && n % 6 != 5) { // this looks like it can be taken outside the for loop
                return false;
            }
            if (n % primeArray[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public int size(){ return primeCount -1; }

    public int[] getPrimeArray(){ return primeArray; }


    // I implemented this in PrimeSequence
    public static BitSet getPrimesBelow(int n) {
        BitSet sieve = new BitSet(n);
        // default at true = prime
        for (int p = 0; p < n; p++) sieve.flip(p);
        sieve.flip(0);
        sieve.flip(1);
        for (int i = 2; i < n; i++) {
            if (sieve.get(i)) {
                for (int j = 2 * i; j < n; j += i) {
                    sieve.set(j, false); // set all multiples of primes as not prime
                }
            }
        }
        return sieve;
    }
}
