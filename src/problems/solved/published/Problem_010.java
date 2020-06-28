package problems.solved.published;

import problems.ProblemSolver;
import java.util.BitSet;

/**
 * Answer : 142913828922
 * Time Taken : 0.046642066 seconds
 */
public class Problem_010 extends ProblemSolver {

    private final int N = 2000000;
    private BitSet Sieve;

    public Problem_010() {
        super("142913828922");
    }

    @Override
    public void init() {
        this.Sieve = new BitSet(this.N);
    }

    @Override
    public String solve() {
        for (int p = 0; p < this.N; p++){ this.Sieve.flip(p); }  // default at true = prime
        this.Sieve.flip(0);    // flip all non-primes to false
        this.Sieve.flip(1);    //
        for (int i = 2; i < this.N; i++){
            if(this.Sieve.get(i)){
                for(int j = 2*i; j < this.N; j += i){
                    this.Sieve.set(j,false); // set all multiples of primes as not prime
                }
            }
        }
        long sum = 0L;
        for (int i = 0; i < this.N; i++){
            if (this.Sieve.get(i)){
                sum += i;
            }
        }
        return Long.toString(sum);
    }

}
