import java.util.*;

public class RectangularSum {
    long height;
    long width;

	public long minimalArea(int height, int width, long S) {
        this.height = height;
        this.width  = width;

		long s2 = S * 2;
        long result = -1;
        for(long mn = 1 ; mn <= (long)Math.sqrt(s2); mn ++)
        {
            if(s2%mn ==0)
                result = solve(s2/mn, mn);
            if(result != -1)
                return result;
        }
        for(long mn = (long)Math.sqrt(s2) ; mn >= 1 ; mn --)
        {
            if(s2%mn ==0)
                result = solve(mn, s2/mn);
            if(result != -1)
                return result;
        }
        return -1;
	}

    long solve(long s, long mn){
        if(mn > height*width)
            return -1;
        long result = -1;
        for(long m = height; m >=1 ; m --){
            if(mn%m != 0)
                continue;
            long n = mn/m;
            if(n > width)
                continue;
            long x0 = s - (n - 1) - m*width + width;
            if(x0%2 != 0 || x0 < 0)
                continue;
            x0 = x0/2;
            long x = x0 / width;
            long y = x0 % width;
            if((y + n - 1)<width && (x + m -1) <height)
                return mn;
        }
        return -1;
    }
}
