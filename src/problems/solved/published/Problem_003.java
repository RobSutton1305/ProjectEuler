package problems.solved.published;
/*
    Project Euler - Problem_003 - Solved by Rob Sutton on 03/07/2020
	    Answer : 6857
	    Time Taken : 2.68673E-4 seconds
*/

import problems.ProblemSolver;
import tools.numbers.primes.PrimeFactorization;

 public class Problem_003 extends ProblemSolver {

    public Problem_003() {
        super("6857");
    }

    @Override
    public String solve() {
        String number = "600851475143";
        String bitSetLimit = "775146"; // squareRoot of 600851475143
        PrimeFactorization primeFactorization = new PrimeFactorization(number,bitSetLimit);
        //PrimeFactorization.findLargestPrimeFactor(longNumber).toString();
        return primeFactorization.printSequence(true);
    }

}
