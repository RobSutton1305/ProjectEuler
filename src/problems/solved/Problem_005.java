package problems.solved;

import problems.ProblemSolver;

public class Problem_005 extends ProblemSolver {

    public Problem_005() {
        super("232792560");
    }

    @Override
    public String solve() {
        int i = 20;
        while (true){
            i += 20;
            boolean flag = true;
            for (int j = 1; j < 21; j++){
                if (i % j != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag){ return Integer.toString(i); }
        }
    }

    public void testProblem_005() {
        ProblemSolver Problem = new Problem_005();
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
