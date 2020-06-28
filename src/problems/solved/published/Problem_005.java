package problems.solved.published;

import problems.ProblemSolver;

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
        int i = 0;
        while (true){
            i += 9699690; /* 2*3*5*7*11*13*17*19, answer must be a multiple of this. */
            if (i % 4 != 0) { continue; }
            if (i % 6 != 0) { continue; }
            if (i % 8 != 0) { continue; }
            if (i % 9 != 0) { continue; }
            if (i % 10 != 0) { continue; }
            if (i % 14 != 0) { continue; }
            if (i % 15 != 0) { continue; }
            if (i % 16 != 0) { continue; }
            if (i % 18 != 0) { continue; }
            if (i % 20 != 0) { continue; }
            return Integer.toString(i);
        }
    }

}
