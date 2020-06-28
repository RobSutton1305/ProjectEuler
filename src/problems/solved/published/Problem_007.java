package problems.solved.published;

import problems.ProblemSolver;
import tools.numbers.primes.Primes;

/**
 Answer : 104743
 Time Taken : 2.152E-6 seconds
 */
public class Problem_007 extends ProblemSolver {

    private tools.numbers.primes.Primes Primes;

    public Problem_007() {
        super("104743");
    }

    @Override
    public void init() {
        this.Primes = new Primes(123456); // Big enough that prime array is over 10001 in length
    }

    @Override
    public String solve() {
        int[] primes = this.Primes.getPrimeArray();
        int n = 10001;
        return Integer.toString(primes[n - 1]);
    }


}
