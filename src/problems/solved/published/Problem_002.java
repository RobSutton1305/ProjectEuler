package problems.solved.published;
/*
    Project Euler - Problem_002 - Solved by Rob Sutton on 03/07/2020
	    Answer : 4613732
	    Time Taken : 2.92028E-4 seconds
*/

import problems.ProblemSolver;
import tools.numbers.sequences.FibonacciSequence;
import tools.numbers.types.NumberType;

/**
 Answer : 4613732
 Time Taken : 2.92028E-4 seconds
 */
public class Problem_002 extends ProblemSolver {

    public Problem_002(){
        super("4613732");
    }

    @Override
    public String solve() {
        Integer sumEvenFibonacci = 0;
        // Initial Numbers
        FibonacciSequence fibonacciSequence = new FibonacciSequence("Integer");
        fibonacciSequence.generateUpToLimit("4000000");
        int index = 0; // Every third Fibonacci number is even.
        for (NumberType numberType : fibonacciSequence){
            if (++index % 3 == 0) sumEvenFibonacci += (Integer)numberType.VALUE;
        }
        return Long.toString(sumEvenFibonacci);
    }

}
