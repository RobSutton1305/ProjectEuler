package problems.solved.unpublished;

import problems.ProblemSolver;
import java.util.ArrayList;
import java.util.BitSet;

/**
 *  Answer : 128088830547982
 *  Time Taken : 73s
 */
public class Problem_719 extends ProblemSolver {

    private final int POWER = 12;
    private BitSet uniqueSolutions;

    public Problem_719 (){
        super("128088830547982");
    }

    @Override
    protected void init() {
        this.uniqueSolutions = new BitSet(this.POWER / 2);
    }

    @Override
    protected String solve() {
        long count = 0L;
        for (long i = 2L; i < Math.pow(10, 0.5*this.POWER); i++) {
            if (i % 9 > 1) continue;
            this.splitNumber(i, Long.toString(i*i), new ArrayList<>());
            if (this.uniqueSolutions.get(Integer.parseInt(Long.toString(i)))) count += i*i;
        }
        return Long.toString((long) (count+Math.pow(10, POWER)));
    }

    private void splitNumber(Long i, String S, ArrayList<String> Numbers){
        if (S.length() == 0){
            long sumSubStrings = 0L;
            for (String subString : Numbers) { sumSubStrings += Long.parseLong(subString);  }
            if (sumSubStrings == i) { this.uniqueSolutions.set(Integer.parseInt(String.valueOf(i)), true); }
            return;
        }
        int len = S.length();
        for( int k = 1; k <= len; k++){
            ArrayList<String> newNumbers = new ArrayList<>(Numbers);
            newNumbers.add(S.substring(0, k));
            splitNumber(i, S.substring(k,len), newNumbers);
        }
    }

}