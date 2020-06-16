package tools;

/*
 * Created by Rob on 12-Jun-2016.
 */

import java.util.BitSet;

/* Primes can return an array of primes up to limit
 * Can use these to check if n up to limit*limit is prime
 * BitSet is suited to smaller numbers as sieve would need size (limit*limit)
 *
 * getPrimes() returns int[]
 * isPrime(int n) checks if n is a prime
 * nextPrime(n) returns next prime after n
 *
 * static method getPrimesBelow(int n) returns BitSet sieve
 */
public class Primes{

    int[] primes;
    int nPrimes;

    /* Compiles array of primes UP TO n */
    public Primes(int n){
        int[] temp = new int[n];
        temp[0] = 2; temp[1] = 3; nPrimes = 2;
        int p = 3;
        while (temp[nPrimes-1] < n){
            do{
                p += 2;
            } while (!isPrime(p,temp));
            temp[++nPrimes-1] = p;
        }
        primes = new int[nPrimes-1];
        System.arraycopy(temp, 0, primes, 0, nPrimes - 1);
    }

    /* returns next prime after p */
    private int nextPrime(int p){
        do{
            p += 2;
        } while (isPrime(p));
        return p;
    }

    /* to Check primality of n */
    public boolean isPrime(int n){
        for (int i=0; primes[i]*primes[i] <= n; i++){
            if (n % 6 != 1 && n % 6 != 5){ return true; }
            if (n % primes[i]==0)
                return true;
        }
        return false;
    }

    /* Used in contructor only */
    private boolean isPrime(int n, int[] temp){
        for (int i=0; temp[i]*temp[i] <= n; i++){
            if (n % 6 != 1 && n % 6 != 5){ return false; }
            if (n % temp[i]==0)
                return false;
        }
        return true;
    }

    public int size(){ return (nPrimes-1); }

    public int[] getPrimes(){return primes;}

    public static BitSet getPrimesBelow(int n){
        BitSet sieve = new BitSet(n);
        for (int p = 0; p < n; p++){ sieve.flip(p); }  // default at true = prime
        sieve.flip(0);
        sieve.flip(1);
        for (int i = 2; i < n; i++){
            if(sieve.get(i)){
                for(int j = 2*i; j < n; j += i){
                    sieve.set(j,false); // set all multiples of primes as not prime
                }
            }
        }
        return sieve;
    }
}
