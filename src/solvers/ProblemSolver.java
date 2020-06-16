package solvers;

public abstract class ProblemSolver implements ProblemSolverInterface {

    protected String ANSWER;
    private long TIME_START, TIME_STOP;

    protected ProblemSolver() {
        this.init();
        this.TIME_START = System.nanoTime();
        this.ANSWER = this.solve();
        this.TIME_STOP = System.nanoTime();
        this.print();
    }

    @Override
    public void init() {
    }

    @Override
    public String solve() {
        return "Override this method.";
    }

    @Override
    public void print() {
        System.out.println("\n\t Answer : " + this.ANSWER);
        final long TIME_NANO = this.TIME_STOP - this.TIME_START;
        if (TIME_NANO < 60000000000L) {
            final double TIME_SECONDS = TIME_NANO / 1000000000.0;
            System.out.println("\t Time Taken : " + TIME_SECONDS + " seconds\n");
        } else {
            System.out.println("\t Time Taken : " + (TIME_NANO / 1000000000) + "s\n");
        }
    }

}
