package problems.solved;

import problems.ProblemSolver;
import tools.numbers.primes.Primes;

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

    public void testProblem_007() {
        ProblemSolver Problem = new Problem_007();
        assert Problem.checkResult();
    }

}
