import java.util.*;

public class TwoConvexShapes {
    int xLen ;
    int yLen ;
    String[] g;
    int mod = 1000000007;

    char gc(int x, int y, boolean rev) {
        if (!rev)
            return g[x].charAt(y);
        else
            return g[x].charAt(yLen-1-y);

    }

    int add(int a, int b) {
        return (a + b + mod) % mod;
    }

	public int countWays(String[] grid) {
		g = grid;
        xLen = g.length;
        yLen = g[0].length();

        int ret = 0;
        ret = add(ret, solve('W', 'B', true));
        ret = add(ret, solve('W', 'B', false));
        ret = add(ret, solve('B', 'W', true));
        ret = add(ret, solve('B', 'W', false));
        ret = add(ret, -1 * solvedup());
        return ret;
	}

    int solvedup() {
        char lchar = 'W', rchar = 'B';
        int ret = 0;
        for(int j = -1; j < yLen; j ++){
            boolean valid = true;
            for(int x = 0 ; x < xLen && valid; x ++) {
                for(int y = 0 ; y <= j ; y ++) {
                    if(gc(x,y, false) == rchar){
                        valid = false;
                        break;
                    }
                }

                for(int y = j + 1 ; y <yLen; y ++){
                    if(gc(x,y, false) == lchar){
                        valid = false;
                        break;
                    }
                }
            }
            if(valid)
                if(j == -1 || yLen == yLen - 1)
                    ret += 3;
                else
                    ret += 3;
        }
        lchar = 'B';
        rchar = 'W';

        for(int j = 0; j < yLen -1; j ++){
            boolean valid = true;
            for(int x = 0 ; x < xLen && valid; x ++) {
                for(int y = 0 ; y <= j ; y ++) {
                    if(gc(x,y, false) == rchar){
                        valid = false;
                        break;
                    }
                }

                for(int y = j + 1 ; y <yLen; y ++){
                    if(gc(x,y, false) == lchar){
                        valid = false;
                        break;
                    }
                }
            }
            if(valid)
                ret ++;
        }
        return ret;
    }

    int solve(char first, char second, boolean rev) {
        int dp[][] = new int[2][52];
        int idx = 0;

        for(int i = 0 ; i < xLen; i ++) {
            Arrays.fill(dp[idx^1], 0);
            int fidx = -1;
            int sidx =Integer.MAX_VALUE;
            for(int j = 0; j < yLen; j ++) {
                char c = gc(i, j, rev);
                if(c == first) {
                    if(sidx != Integer.MAX_VALUE)
                        return 0;
                    fidx  = Math.max(fidx, j);
                }
                if(c == second) {
                    sidx = Math.min(sidx, j);
                }
                if(fidx > sidx)
                    return 0;

            }

            for(int j = fidx; j<yLen && j < sidx; j ++) {
                int len = j + 1;
                if(i == 0) {
                    dp[idx^1][len] = 1;
                }
                else{
                    for(int k = 0; k <= len; k ++) {
                        dp[idx^1][len] = add (dp[idx^1][len], dp[idx][k]);
                    }
                }
            }
            idx = idx ^ 1;
        }
        int ret = 0;
        for(int i = 0; i <52 ; i ++) {
            ret = add(ret, dp[idx][i]);
        }
        return ret;
    }


}
