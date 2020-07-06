package problems.solved.published;
/*
    Project Euler - Problem_010 - Solved by Rob Sutton on 03/07/2020
	    Answer : 142913828922
	    Time Taken : 0.046642066 seconds
*/

import problems.ProblemSolver;
import java.util.BitSet;

public class Problem_010 extends ProblemSolver {

    public Problem_010() {
        super("142913828922");
    }

    @Override
    public String solve() {
        int n = 2000000;
        BitSet sieve = new BitSet(n);
        for (int p = 0; p < n; p++){ sieve.flip(p); }  // default at true = prime
        sieve.flip(0);    // flip all non-primes to false
        sieve.flip(1);    //
        for (int i = 2; i < n; i++){
            if(sieve.get(i)){
                for(int j = 2*i; j < n; j += i){
                    sieve.set(j,false); // set all multiples of primes as not prime
                }
            }
        }
        long sum = 0L;
        for (int i = 0; i < n; i++){
            if (sieve.get(i)){
                sum += i;
            }
        }
        return Long.toString(sum);
    }

}
