package problems.solved.published;

import org.codehaus.groovy.runtime.typehandling.IntegerMath;
import problems.ProblemSolver;
import tools.numbers.sequences.TriangleSequence;
import static tools.numbers.divisors.Divisors.countDivisors;

/**
 Answer : 76576500
 Time Taken : 0.173355204 seconds
 */
public class Problem_012 extends ProblemSolver {

    public Problem_012() {
        super("76576500"    );
    }

    @Override
    public String solve() {
        TriangleSequence TriangleSequence = new TriangleSequence("Integer");
        while (IntegerMath.compareTo( countDivisors((Integer)TriangleSequence.getLast().VALUE)  , 500) < 0){
            TriangleSequence.generateNext();
        }
        return TriangleSequence.getLast().VALUE.toString();
    }

}
