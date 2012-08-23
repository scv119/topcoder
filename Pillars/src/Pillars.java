import java.util.*;

public class Pillars {
    double dp[];
    double dp1[];
    int max;
    int min;
	public double getExpectedLength(int w, int x, int y) {
        max = Math.max(x,y);
        min = Math.min(x,y);
		dp = new double[max+5];
        dp1 = new double[max+5];
        Arrays.fill(dp,-1);
        Arrays.fill(dp1,-1);
        long size = x * y;

        for(int i = 1  ; i <=max+4; i ++ ){
            dp[i] = Math.sqrt(i*i + w*w);

            dp1[i] = dp[i]/size;
            if(i >= 2){
                dp1[i] += dp1[i-1];

            }
        }

        double result = 0;
        for(int i = 1; i <= min; i ++){
            result+= w/size;
            if(i > 1)
                result += dp1[Math.abs(i-1)];
            if(i < max)
                result += dp1[max-i];
        }
        return result;

	}
}
