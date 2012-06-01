import java.util.*;

public class BoardSplitting {
	public int minimumCuts(int dL, int dC, int aL) {
        if(dL == aL)
            return 0;
        if(dL > aL)
            dL = dL - aL;
        int gld = dL * aL / gcd(dL, aL);
        int count = gld/dL;
        int slice = 0;
        if(gld == aL){
            slice = aL/dL - 1;
        }
        else{
            int aC = gld/aL;
            slice = (aL/dL) * aC;
            slice += aC * (aL%dL) / dL - 1;
        }
        int ret = 0;
        ret = dC/count * slice;
        ret += dC%count;
        return ret;
	}

    int gcd(int a, int b){
        return a == 0 ? b : gcd(b%a, a);
    }
}
