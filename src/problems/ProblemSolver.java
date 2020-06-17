package problems;

import groovy.util.GroovyTestCase;
import org.junit.Test;

public abstract class ProblemSolver extends GroovyTestCase {

    protected String ANSWER, EXPECTED_ANSWER;
    private final long TIME_START, TIME_STOP;

    protected ProblemSolver(String EXPECTED_ANSWER) {
        this.EXPECTED_ANSWER = EXPECTED_ANSWER;
        this.init();
        this.TIME_START = System.nanoTime();
        this.ANSWER = this.solve();
        this.TIME_STOP = System.nanoTime();
        this.print();
    }

    protected void init() {
    }

    protected String solve() {
        return "";
    }

    protected void print() {
        System.out.println("\n\t Answer : " + this.ANSWER);
        final long TIME_NANO = this.TIME_STOP - this.TIME_START;
        if (TIME_NANO < 60000000000L) {
            final double TIME_SECONDS = TIME_NANO / 1000000000.0;
            System.out.println("\t Time Taken : " + TIME_SECONDS + " seconds\n");
        } else {
            System.out.println("\t Time Taken : " + (TIME_NANO / 1000000000) + "s\n");
        }
    }

    public Boolean checkResult(){
        return this.ANSWER.equals(this.EXPECTED_ANSWER);
    }

}
