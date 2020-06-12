package problems.solved;

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
        this.LIMIT = 4000000;
    }

    @Override
    public String solve() {
        int count = 0; // sum of even Fibonacci numbers <= LIMIT
        int a = 1;
        int b = 1;
        int c = a + b;

        while(c <= this.LIMIT){
            if (c%2==0){ count += c; }
            a = b;
            b = c;
            c = a + b;
        }

        return Integer.toString(count);
    }
}
