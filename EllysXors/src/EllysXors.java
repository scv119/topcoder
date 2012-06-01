import java.util.*;

public class EllysXors {
    public long getXor(long L, long R){
        long[] l = getOneNum(L - 1);
        long[] r = getOneNum(R);

        long result = 0;
        long radix =  1;
        for(int i = 0 ; i < 40 ; i ++){
            result += ((r[i] - l[i])%2) * radix;
            radix *=2 ;
        }
        return result;
    }

    long[] getOneNum(long x){
        x = x + 1;
        long radix = 2;
        long result[] = new long[40];
        for(int  i = 0 ; i< 40 ; i ++){
            long count = x / radix * (radix/2);
            long remain = x%radix - radix/2;
            if(remain > 0)
                count += remain;
            result[i] = count;
            radix *= 2;
        }
        return result;
    }

}
