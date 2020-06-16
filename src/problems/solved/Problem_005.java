package problems.solved;

import solvers.ProblemSolver;

public class Problem_005 extends ProblemSolver {

    private int N;

    public Problem_005() {
        super();
    }

    @Override
    public void init() {
        this.N = 1000;
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

}
