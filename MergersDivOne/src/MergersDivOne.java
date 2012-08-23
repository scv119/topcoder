import java.util.*;

public class MergersDivOne {
    double dp[];
	public double findMaximum(int[] revenues) {
		Arrays.sort(revenues);
        dp = new double[revenues.length+1];
        dp[0] = revenues[0];
        dp[1] = (revenues[0] + revenues[1])/2d;
        for(int i = 2; i < revenues.length ; i++){
            double max = Integer.MIN_VALUE;
            for(int start = 0; start < i; start ++){
                double sum = 0;
                for(int j = start; j <= i ;j ++ )
                    if(j == start)
                        sum += dp[j];
                    else
                        sum += revenues[j];
                sum/= (i-start+1);
                if(sum > max)
                    max = sum;
            }
            dp[i] = max;
        }
        return dp[revenues.length-1];
    }


}
