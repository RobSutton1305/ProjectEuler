package problems.solved;

import problems.ProblemSolver;

public class Problem_003 extends ProblemSolver {

    private final long L = 600851475143L;

    public Problem_003() {
        super("6857");
    }

    @Override
    public String solve() {
        return tools.PrimeFactors.findLargestPrimeFactor(L).toString();
    }

    public void testProblem_003() {
        ProblemSolver Problem = new Problem_003();
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
