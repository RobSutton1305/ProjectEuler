package problems.solved.published;
/*
    Project Euler - Problem_012 - Solved by Rob Sutton on 03/07/2020
	    Answer : 76576500
	    Time Taken : 0.173355204 seconds
*/

import org.codehaus.groovy.runtime.typehandling.IntegerMath;
import problems.ProblemSolver;
import tools.numbers.sequences.TriangleSequence;
import static tools.numbers.divisors.Divisors.countDivisors;

public class Problem_012 extends ProblemSolver {

    public Problem_012() {
        super("76576500"    );
    }

    @Override
    public String solve() {
        TriangleSequence triangleSequence = new TriangleSequence("Integer");
        while (IntegerMath.compareTo( countDivisors((Integer)triangleSequence.getLast().VALUE)  , 500) < 0){
            triangleSequence.generateNext();
        }
        return triangleSequence.getLast().valueToString();
    }

}
