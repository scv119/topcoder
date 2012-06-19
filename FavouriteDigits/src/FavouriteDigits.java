import java.util.*;

public class FavouriteDigits {
    int d1;int c1;
    int d2;int c2;

	public long findNext(long N, int d11, int c11, int d22, int c22) {
        long result = 0;
		if(d11 > d22){
            d1 = d22; c1 = c22;d2 = d11; c2 = c11;
        }
        else{
            d1 = d11; c1 = c11; d2= d22; c2 = c22;
        }

        int len = getLen(N);
        if(len < c1 + c2)                    {
            N = (long)Math.pow(10,(c1+c2)-1);
            len = c1 + c2;
        }

        long ret = -1;

        ret = calc(N, len, c1,c2);

        if(ret == -1)
            ret = calc((long)Math.pow(10,len),len+1,c1,c2);
        return ret;

	}

    int getLen(long value){
        int len = 0;
        while(value != 0){
            len ++;
            value = value/10;
        }
        return len;
    }

    long calc(long value, int len, long c1, long c2){
        long result = -1;
        if(c1 + c2 > len)
            return result;

        if(c1 == 0 && c2 == 0)
            return value;

        long base = value/(long)Math.pow(10,len-1);
        long left = value%(long)Math.pow(10,len-1);

        long ret = calc(left, len - 1, (d1 == base && c1 > 0)?(c1-1):c1, (d2 == base && c2 > 0)?(c2-1):c2);
        if(ret != -1)
            return value - left + ret;
        for(long b = base+1;b<=9;b++){
            long nc1 = c1;
            long nc2 = c2;
            if(b == d1 && c1 > 0)
                nc1 = c1 - 1;
            if(b == d2 && c2 > 0)
                nc2 = c2 - 1;

            ret = calc(0,len-1,nc1, nc2);

            if(ret != -1)
                return (long)(Math.pow(10,len-1)) * b + ret;
        }
        return -1;

    }
}
