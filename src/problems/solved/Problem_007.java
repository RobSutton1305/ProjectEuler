package problems.solved;

import solvers.ProblemSolver;
import tools.Primes;

public class Problem_007 extends ProblemSolver {

    private Primes Primes;
    private Integer N;

    public Problem_007() {
        super();
    }

    @Override
    public void init() {
        this.N = 10001;
        this.Primes = new Primes(123456); // Big enough that prime array is over 10001 in length
    }

    @Override
    public String solve() {
        int[] primes = this.Primes.getPrimes();
        return Integer.toString(primes[this.N - 1]);
    }

}
