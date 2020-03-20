package problems.current;

import solvers.TimedSolver;

public class Problem_002 extends TimedSolver {

    Integer LIMIT;

    public Problem_002 (){
        super();
    }

    public static void main(String[] args) {
        new Problem_002();
    }

    @Override
    public void init() {
        this.LIMIT = 0;
    }

    @Override
    public String solve() {
        int count = 0;
        return Integer.toString(count);
    }
}
