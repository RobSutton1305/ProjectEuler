package problems.solved;

import problems.ProblemSolver;
import tools.Primes;

public class Problem_007 extends ProblemSolver {

    private Primes Primes;
    private final int N = 10001;

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
        return Integer.toString(primes[this.N - 1]);
    }

    public void testProblem_007() {
        ProblemSolver Problem = new Problem_007();
        assert Problem.checkResult();
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
