package problems;
/**
 * Created by Rob Sutton on 09-Mar-2020.
 * https://projecteuler.net/problem=1
 *
 */

public class Problem_000 extends Problem {

    Integer INPUT;

    public Problem_000 (){
        super();
    }

    @Override
    public void init() {
        this.INPUT = 100;
    }

    @Override
    public String solve() {
        return Integer.toString(INPUT);
    }
}
