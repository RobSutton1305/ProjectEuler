package problems;
/**
 * Created by Rob Sutton on 09-Mar-2020.
 * https://projecteuler.net/problem=1
 *
 * 	 Answer : 233168
 * 	 Time Taken : 1.89092E-4 seconds
 *
*/

public class Problem_001 extends Problem {

    Integer LIMIT;

    public Problem_001 (){
        super();
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
