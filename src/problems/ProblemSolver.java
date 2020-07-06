package problems;
/*
    Project Euler - ABC - Created by Rob Sutton on 03/07/2020
*/
import groovy.util.GroovyTestCase;

public abstract class ProblemSolver extends GroovyTestCase {

    private final String ANSWER;
    private final String EXPECTED_ANSWER;
    private final Long TIME_START, TIME_STOP;

    protected ProblemSolver(String EXPECTED_ANSWER) {
        this.EXPECTED_ANSWER = EXPECTED_ANSWER;
        this.TIME_START = System.nanoTime();
        this.ANSWER = this.solve();
        this.TIME_STOP = System.nanoTime();
        this.print();
    }

    protected abstract String solve();

    private void print() {
        System.out.println("\n\t\tAnswer : " + this.ANSWER);
        final long TIME_NANO = this.TIME_STOP - this.TIME_START;
        if (TIME_NANO < 60000000000L) {
            final double TIME_SECONDS = TIME_NANO / 1000000000.0;
            System.out.println("\t\tTime Taken : " + TIME_SECONDS + " seconds\n");
        } else {
            System.out.println("\t\tTime Taken : " + (TIME_NANO / 1000000000) + "s\n");
        }
    }

    public void testProblem() {
        assert this.ANSWER.equals(this.EXPECTED_ANSWER);
    }

}