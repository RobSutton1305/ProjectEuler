package problems.solved.published;

import problems.ProblemSolver;
import tools.numbers.sequences.PrimeSequence;

/**
 Answer : 104743
 Time Taken : 2.152E-6 seconds
 */
public class Problem_007 extends ProblemSolver {

    private PrimeSequence PrimeSequence;

    public Problem_007() {
        super("104743");
    }

    @Override
    public void init() {
        this.PrimeSequence = new PrimeSequence("Integer");
    }

    @Override
    public String solve() {
        this.PrimeSequence.generateUpToNthIndex(10001);
        return this.PrimeSequence.get(10001 - 1).toString();
    }


}
