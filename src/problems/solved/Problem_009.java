package problems.solved;

import problems.ProblemSolver;

public class Problem_009 extends ProblemSolver {

    public Problem_009() {
        super("31875000");
    }

    @Override
    public String solve() {
        for (int i = 1; i < 1000; i++){
            for (int j = i; j < 1000; j++){
                for (int k = j; k < 1000; k++){
                    if (i*i + j*j == k*k || i*i + k*k == j*j || j*j + k*k == i*i){
                        if (i+j+k == 1000){ return Integer.toString(i*j*k); }

                    }
                }
            }
        }
        return "Error";
    }

    public void testProblem_009() {
        ProblemSolver Problem = new Problem_009();
        assert Problem.checkResult();
    }

}
