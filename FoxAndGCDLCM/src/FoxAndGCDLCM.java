import java.util.*;

public class FoxAndGCDLCM {
	public long get(long G, long L) {
		if(L%G!=0)
            return -1;
        long x = L/G;
        long ss = (long)Math.sqrt(x);
        for(long i = ss; i >= 1; i --)
            if(x%i==0 &&gcd(i,x/i)==1)
                return G * (i+x/i);

        return -1;

	}

    long gcd(long x, long y){
        return x==0?y:gcd(y%x,x);
    }

}


