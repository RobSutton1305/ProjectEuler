package problems.solved.published;
/*
    Project Euler - Problem_004 - Solved by Rob Sutton on 03/07/2020
	    Answer : 906609
	    Time Taken : 1.27099E-4 seconds
*/

import problems.ProblemSolver;
import tools.numbers.types.PalindromeNumberType;

public class Problem_004 extends ProblemSolver {

    public Problem_004() {
        super("906609");
    }

    @Override
    public String solve() {
        for (int i = 1000; i > 950; i--){
            for (int j = i; j > 900; j--){
                PalindromeNumberType palindromeNumberType = new PalindromeNumberType(i*j);
                if (palindromeNumberType.isValid()){
                    return ( palindromeNumberType.valueToString() );
                }
            }
        }
        return "Error";
    }

}