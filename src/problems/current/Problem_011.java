package problems.current;

import problems.ProblemSolver;

public class Problem_011 extends ProblemSolver {

    public Problem_011() {
        super("123");
    }

    @Override
    protected void init() {
    }

    @Override
    protected String solve() {
        return "123";
    }

    public void testProblem_011() {
        ProblemSolver Problem = new Problem_011();
        assert Problem.checkResult();
    }
}
