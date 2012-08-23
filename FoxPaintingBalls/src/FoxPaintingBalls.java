import java.util.*;

public class FoxPaintingBalls {
	public long theMax(long R, long G, long B, int N) {
        long size = (1L + N) * N / 2;
        long left = size%3;
        size = size/3;
        long ret;
        long sum = R + G + B;
        if(N == 1){
            ret = sum;
        }
        else if(left == 0){
            ret = Math.min(R,Math.min(G,B))/size;
        }
        else{
            long min = Math.min(R, Math.min(G,B));
            long maxcount = min/size;

            left = sum - maxcount * size * 3;
            if(left<maxcount){
                long count = sum/(1 + size * 3);
                if(count < maxcount)
                    maxcount = count;

            }
            ret = maxcount;
        }
        return ret;
	}
}
