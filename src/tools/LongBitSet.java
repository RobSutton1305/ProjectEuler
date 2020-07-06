package tools;


/**
 * 
 * @author rana
 *
 */
public class LongBitSet
{
    //--------------------------------------------------------------------
    private static final long WORD_MASK = 0xffffffffffffffffL;


    public static void main(String[] args)
    {
        LongBitSet bits = new LongBitSet(25000000000000L);
                 
        bits.set(24000000000000L);
        System.out.println( bits.get(23999999999999L) );
        System.out.println( bits.get(24000000000000L) );
        System.out.println( bits.get(24000000000001L) );
    }



    //--------------------------------------------------------------------
    private final long[] BITS;


    //--------------------------------------------------------------------
    public LongBitSet(long size)
    {
        BITS = new long[ (int)((size - 1) >> 6) + 1 ];
    }
    private LongBitSet(long[] bits)
    {
        BITS = bits;
    }


    //--------------------------------------------------------------------
    public boolean get(long index)
    {
        int i = wordIndex(index);
        return (BITS[i] & (1L << index)) != 0;
    }

    public void set(long index, boolean value)
    {
        if (value) {
            set(index);
        } else {
            clear(index);
        }
    }


    //--------------------------------------------------------------------
    public void set(long index)
    {
        int i = wordIndex(index);
        BITS[i] |= 1L << index;
    }

    public void clear(long index)
    {
        int i = wordIndex(index);
        BITS[i] &= ~(1L << index);
    }


    //--------------------------------------------------------------------
    public long nextSetBit(long fromIndex)
    {
        int  u    = wordIndex(fromIndex);
        long word = BITS[u] & (WORD_MASK << fromIndex);

        while (true) {
            if (word != 0)
                return (((long) u) * Long.SIZE) +
                       Long.numberOfTrailingZeros(word);

            if (++u == BITS.length) return -1;
            word = BITS[u];
        }
    }


    //--------------------------------------------------------------------
    public int length()
    {
        return BITS.length * Long.SIZE;
    }


    //--------------------------------------------------------------------
    private static int wordIndex(long bitIndex)
    {
        return (int)(bitIndex >> 6);
    }



}