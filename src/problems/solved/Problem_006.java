package problems.solved;

import solvers.ProblemSolver;

public class Problem_006 extends ProblemSolver {

    public Problem_006() {
        super();
    }

    @Override
    public void init() {
    }

    @Override
    public String solve() {
        int sumSquares = 0;
        for (int j = 1; j < 101; j++){ sumSquares += j*j; }
        int squaresum = 0;
        for (int k = 1; k < 101; k++){ squaresum += k; }
        squaresum *= squaresum;
        return Integer.toString(squaresum - sumSquares);
    }

}
