package problems.solved.published;

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
        FibonacciSequence FibonacciSequence = new FibonacciSequence("Integer");
        FibonacciSequence.generateUpToLimit("4000000");
        int INDEX = 0; // Every third Fibonacci number is even.
        for (NumberType N : FibonacciSequence){
            if (++INDEX % 3 == 0) sumEvenFibonacci += (Integer)N.VALUE;
        }
        return Long.toString(sumEvenFibonacci);
    }

}
