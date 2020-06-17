package problems.solved;

import problems.ProblemSolver;

public class Problem_003 extends ProblemSolver {

    public Problem_003() {
        super("6857");
    }

    @Override
    public String solve() {
        long l = 600851475143L;
        return tools.PrimeFactors.findLargestPrimeFactor(l).toString();
    }

    public void testProblem_003() {
        ProblemSolver Problem = new Problem_003();
        assert Problem.checkResult();
    }

}
