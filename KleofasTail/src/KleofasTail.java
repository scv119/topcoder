import java.util.*;

public class KleofasTail {

    long inter(long a, long b, long c, long d){
        long small = Math.max(a,c);
        long big   = Math.min(b,d);
        if(small <= big)
            return big -small + 1;
        return 0;
    }

	public long countGoodSequences(long K, long A, long B) {
        if(K == 0 )
            return B - A + 1;
        if(K == 1)
            return B - A + (A == 0 ? 0:1);
        long left = K, right = K;
        if(K%2==0)
            right = K + 1;
        long result = 0;
        while(left<=B){
            result += inter(left,right,A,B);
            left = left * 2;
            right = right * 2 + 1;
        }
        return result;
    }
}
