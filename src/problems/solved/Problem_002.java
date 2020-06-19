package problems.solved;

import problems.ProblemSolver;
import tools.numbers.sequences.FibonacciSequence;
import tools.numbers.type.NumberType;

import java.math.BigInteger;

public class Problem_002 extends ProblemSolver {

    public Problem_002(){
        super("4613732");
    }

    @Override
    public String solve() {
        Integer sumEvenFibonacci = 0;
        // Initial Numbers
        FibonacciSequence FibonacciSequence = new FibonacciSequence(Integer.class);
        FibonacciSequence.iterateUpToLimit(new BigInteger("4000000"));
        int INDEX = 0; // Every third Fibonacci number is even.
        for (NumberType N : FibonacciSequence){
            if (++INDEX % 3 == 0) sumEvenFibonacci += (Integer)N.VALUE;
        }
        return Long.toString(sumEvenFibonacci);
    }

    public void testProblem_002() {
        ProblemSolver Problem = new Problem_002();
        assert Problem.checkResult();
    }

}
