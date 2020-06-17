package problems.solved;

import problems.ProblemSolver;

public class Problem_002 extends ProblemSolver {

    private final int LIMIT = 4000000;

    public Problem_002(){
        super("4613732");
    }

    @Override
    public String solve() {
        int count = 0; // sum of even Fibonacci numbers <= LIMIT
        int a = 1;
        int b = 1;
        int c = a + b;
        while(c <= this.LIMIT){
            if ( c % 2 == 0 ){ count += c; }
            a = b;
            b = c;
            c = a + b;
        }
        return Integer.toString(count);
    }

    public void testProblem_002() {
        ProblemSolver Problem = new Problem_002();
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
