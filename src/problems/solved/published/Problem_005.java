package problems.solved.published;

import problems.ProblemSolver;
import tools.numbers.multiples.LowestCommonMultiple;
import tools.numbers.primes.PrimeFactorization;

/**
 Answer : 232792560
 Time Taken : 1.813E-6 seconds
 */
public class Problem_005 extends ProblemSolver {

    public Problem_005() {
        super("232792560");
    }

    @Override
    public String solve() {
        LowestCommonMultiple LCM = new LowestCommonMultiple();
        for (int i = 1; i <= 20; i++){
            PrimeFactorization PF = new PrimeFactorization("Integer");
            LCM.add(PF);
        }
        return LCM.toString();
    }

}
