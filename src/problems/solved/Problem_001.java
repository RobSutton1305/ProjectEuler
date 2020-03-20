package problems.solved;

import solvers.TimedSolver;

public class Problem_001 extends TimedSolver {

    Integer LIMIT;

    public Problem_001 (){
        super();
    }

    public static void main(String[] args) {
        new Problem_001();
    }

    @Override
    public void init() {
        this.LIMIT = 1000;
    }

    @Override
    public String solve() {
        int count = 0;
        for (int i = 0; i < this.LIMIT; i++){
            if ((i%3==0) || (i%5==0)){
                count += i;
            }
        }
        return Integer.toString(count);
    }
}
