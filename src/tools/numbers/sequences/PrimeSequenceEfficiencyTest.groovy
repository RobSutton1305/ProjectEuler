package tools.numbers.sequences
/*
    Project Euler - PrimeSequenceEfficiencyTest - Created by Rob Sutton on 05/07/2020

    Findings : BitSet is fast up to 10^8 then runs out of memory TODO - light weight
             : generateNext is really slow
*/

class PrimeSequenceEfficiencyTest extends GroovyTestCase {

    private ArrayList<String> integerLimits;
    private ArrayList<String> longLimits;
    private ArrayList<String> bigIntegerLimits;
    private String BITSET_LIMIT
    private final int LIMIT_MIN = 1
    private final int LIMIT_MAX = 7 // [1,2*BITSET_MAX]
    private final int BITSET_MAX = 7 // Ignored if higher than LIMIT_MAX
    private final String NUMBER_CLASS = "ALL" // ALL, Integer, Long, BigInteger

    /* This test Integer, Long and BigInteger - each with and without initial BitSet */
    void setUp() {
        integerLimits = new ArrayList<>()
        longLimits = new ArrayList<>()
        bigIntegerLimits = new ArrayList<>()
        BITSET_LIMIT = BigInteger.TEN.pow(Math.min(BITSET_MAX,LIMIT_MAX))
        for (int k = Math.max(LIMIT_MIN,1); k <= Math.min(LIMIT_MAX,9); k++) {
            integerLimits.add(BigInteger.TEN.pow(k) as String)
        }
        for (int k = Math.max(LIMIT_MIN,1); k <= Math.min(LIMIT_MAX,18); k++) {
            longLimits.add(BigInteger.TEN.pow(k) as String)
        }
        for (int k = Math.max(LIMIT_MIN,1); k <= LIMIT_MAX; k++) {
            bigIntegerLimits.add(BigInteger.TEN.pow(k) as String)
        }
    }

    // testEfficiency
    void testEfficiency() {
        for (String limit : integerLimits) {
            switch (NUMBER_CLASS){
                case "ALL":
                    timedRun(limit, "Integer", BITSET_LIMIT)
                    timedRun(limit, "Long", BITSET_LIMIT)
                    timedRun(limit, "BigInteger", BITSET_LIMIT)
                    break
                case "Integer" : timedRun(limit, "Integer", BITSET_LIMIT)
                    break
                case "Long" : timedRun(limit, "Long", BITSET_LIMIT)
                    break
                case "BigInteger" : timedRun(limit, "BigInteger", BITSET_LIMIT)
                    break
                default: fail("NUMBER_CLASS is not valid.")
            }
        }
    }

    static void timedRun(String limit, String numberClass, String bitSetLimit) {
        final Long TIME_START = System.nanoTime()
        System.out.print(limit +" "+numberClass+" "+bitSetLimit)
        NumberSequence numberSequence = new PrimeSequence(numberClass, bitSetLimit)
        numberSequence.generateUpToLimit(limit)
        System.out.print(" " + numberSequence.size())
        Long TIME_STOP = System.nanoTime()
        final long TIME_NANO = TIME_STOP - TIME_START
        System.out.print(" " + TIME_NANO + "\n")
    }

}
