package problems.solved.published;
/*
    Project Euler - Problem_006 - Solved by Rob Sutton on 03/07/2020
	    Answer : 25164150
	    Time Taken : 3.627E-6 seconds
*/

import problems.ProblemSolver;

public class Problem_006 extends ProblemSolver {

    public Problem_006() {
        super("25164150");
    }

    @Override
    public String solve() {
        int sumOfSquares = 0;
        for (int j = 1; j < 101; j++){ sumOfSquares += j*j; }
        int squareOfSum = 0;
        for (int k = 1; k < 101; k++){ squareOfSum += k; }
        squareOfSum *= squareOfSum;
        return Integer.toString(squareOfSum - sumOfSquares);
    }

}
