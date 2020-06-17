package problems.solved;

import problems.ProblemSolver;

public class Problem_004 extends ProblemSolver {

    public Problem_004() {
        super("906609");
    }

    @Override
    public String solve() {
        for (int i = 1000; i > 900; i--){
            for (int j = 1000; j > 900; j--){
                int a = i*j;
                String b = Integer.toString(a/1000);
                String c = Integer.toString(a);
                String d = c.substring(5,6);
                d += c.substring(4,5);
                d += c.substring(3,4);
                if (d.equals(b)){ return (Integer.toString(i*j)); }
            }
        }
        return "Error";
    }

    public void testProblem_004() {
        ProblemSolver Problem = new Problem_004();
        assert Problem.checkResult();
    }

}
