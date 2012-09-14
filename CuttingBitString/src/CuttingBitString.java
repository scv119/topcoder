import java.util.*;

public class CuttingBitString {
	public int getmin(String S) {

        int g[][] = new int[52][52];

        Set<String> list = new HashSet<String>();

        long value = 1;
        while(true) {
            String s= Long.toBinaryString(value);
            if(s.length() > 50)
                break;
            list.add(s);
            value = value * 5;
        }

        for(int i = 0 ; i < S.length(); i ++) {
            for(int endidx = i ; endidx < S.length() ; endidx ++) {
                String subStr = S.substring(i, endidx+1);
                if(list.contains(subStr))
                    g[i][endidx] = 1;
            }
        }

        int dp[] = new int[52];

        Arrays.fill(dp, Integer.MAX_VALUE);

        for(int i = 0 ; i < S.length() ; i ++) {
            int mycount = 0;
            if(i != 0)
                mycount = dp[i-1];
            if(mycount == Integer.MAX_VALUE)
                continue;
            for(int j = i ;j < S.length() ; j ++) {
                if(g[i][j] == 1) {
                    dp[j] = Math.min(dp[j], mycount + 1);
                }
            }
        }
		int ret =  dp[S.length()-1];
        if(ret == Integer.MAX_VALUE)
            ret = -1;
        return ret;
	}
}
