import java.util.*;

public class FavouriteDigits {

    int d1,d2,c1,c2;
    long inf = -1;

	public long findNext(long N, int d11, int c11, int d22, int c22) {
        if(d11 < d22){
            d1 = d11; c1 = c11; d2 = d22; c2 = c22;
        }
        else{
            d1 = d22; c1 = c22; d2 = d11; c2 = c11;
        }
        long result = 0;
        int len = 0;
        len = (N + "").length();
        if(len < c1 + c2) {
            N = (long)(Math.pow(10, c1 + c2-1));
            len = c1 + c2;
        }
        result = solve(N, len , c1, c2);
        if(result == inf)
        {
            N = (long)(Math.pow(10, len));
            len = len+1;
        }
        return solve(N,len,c1,c2);
	}

    long solve(long base, int len, int count1, int count2){
        if(len < count1 + count2)
            return -1;
        if(count1 + count2 == 0)
            return base;



        long radix = (long)Math.pow(10,len-1);
        long num = base/radix;
        long left = base - num * radix;
        long result = inf;
        if(d1 == num && count1 > 0)
            result = solve(left, len -1, count1 - 1, count2);
        else if(d2 == num && count2 > 0)
            result = solve(left, len -1, count1, count2 - 1);
        else
            result = solve(left, len -1, count1,  count2);
        if(result >= 0)
            return num * radix + result;
        num ++;
        while(num <= 9){
            if(d1 == num && count1 > 0)
                result = solve(0, len -1, count1 - 1, count2);
            else if(d2 == num && count2 > 0)
                result = solve(0, len -1, count1, count2 - 1);
            else
                result = solve(0, len -1, count1,  count2);
            if(result >= 0)
                return num * radix + result;
            num ++;
        }
        return -1;
    }

}
