package problems.solved.published;
/*
    Project Euler - Problem_007 - Solved by Rob Sutton on 03/07/2020
	    Answer : 104743
	    Time Taken : 2.152E-6 seconds
*/

import problems.ProblemSolver;
import tools.numbers.sequences.PrimeSequence;

public class Problem_007 extends ProblemSolver {

    public Problem_007() {
        super("104743");
    }

    @Override
    public String solve() {
        return (new PrimeSequence("Integer", "150000")).get(10000).valueToString();
    }


}
