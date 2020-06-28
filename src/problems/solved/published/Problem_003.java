package problems.solved.published;

import problems.ProblemSolver;
import tools.numbers.factors.PrimeFactors;

/**
 *  Answer : 6857
 *  Time Taken : 2.68673E-4 seconds
*/
 public class Problem_003 extends ProblemSolver {

    public Problem_003() {
        super("6857");
    }

    @Override
    public String solve() {
        long l = 600851475143L;
        return PrimeFactors.findLargestPrimeFactor(l).toString();
    }

}
