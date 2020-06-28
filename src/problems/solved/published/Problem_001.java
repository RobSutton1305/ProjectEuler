package problems.solved.published;

import problems.ProblemSolver;

/**
 * 	 Answer : 233168
 * 	 Time Taken : 2.4449E-5 seconds
 */
public class Problem_001 extends ProblemSolver {

    public Problem_001 (){
        super("233168");
    }

    @Override
    protected String solve() {
        int count = 0;
        int LIMIT = 1000;
        for (int i = 0; i < LIMIT; i++){
            if ((i%3==0) || (i%5==0)){
                count += i;
            }
        }
        return Integer.toString(count);
    }

}
