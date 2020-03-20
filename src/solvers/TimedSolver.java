package solvers;

public abstract class TimedSolver implements SolverInterface {

    private final long TIME_START, TIME_STOP;
    private final String ANSWER;

    public TimedSolver() {
        this.init();
        this.TIME_START = System.nanoTime();
        this.ANSWER = this.solve();
        this.TIME_STOP = System.nanoTime();
        this.print();
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
