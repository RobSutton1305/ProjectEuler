package problems.solved;

import problems.ProblemSolver;

public class Problem_001 extends ProblemSolver {

    private final int LIMIT = 1000;

    public Problem_001 (){
        super("233168");
    }

    @Override
    protected String solve() {
        int count = 0;
        for (int i = 0; i < this.LIMIT; i++){
            if ((i%3==0) || (i%5==0)){
                count += i;
            }
        }
        return Integer.toString(count);
    }

    public void testProblem_001() {
        ProblemSolver Problem = new Problem_001();
        assert Problem.checkResult();
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
