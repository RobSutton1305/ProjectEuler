package problems.solved;

import problems.ProblemSolver;

public class Problem_006 extends ProblemSolver {

    public Problem_006() {
        super("25164150");
    }

    @Override
    public String solve() {
        int sumSquares = 0;
        for (int j = 1; j < 101; j++){ sumSquares += j*j; }
        int squareSum = 0;
        for (int k = 1; k < 101; k++){ squareSum += k; }
        squareSum *= squareSum;
        return Integer.toString(squareSum - sumSquares);
    }

    public void testProblem_006() {
        ProblemSolver Problem = new Problem_006();
        assert Problem.checkResult();
    }

}
