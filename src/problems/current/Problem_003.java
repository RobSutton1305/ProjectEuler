package problems.current;

import solvers.TimedSolver;

public class Problem_003 extends TimedSolver {

    Integer N;

    public Problem_003(){
        super();
    }

    public static void main(String[] args) {
        new Problem_003();
    }

    @Override
    public void init() {
        this.N = 13195;
    }

    @Override
    public String solve() {
        return Integer.toString(13195);
    }
}
