package problems.solved;

import solvers.ProblemSolver;

public class Problem_003 extends ProblemSolver {

    private Long N;

    public Problem_003() {
        super();
    }

    @Override
    public void init() {
        this.N = 600851475143L;
    }

    @Override
    public String solve() {
        return tools.PrimeFactors.findLargestPrimeFactor(N).toString();
    }

}
