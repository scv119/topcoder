import java.util.*;

public class FoxAndSorting {
    long dp[][] ;
    public FoxAndSorting(){
        dp = new long[20][200];
        dp[0][0] = 1;
        for(int i =  1; i < 19 ; i++){
            for(int j = 0; j < 200; j ++){
                for(int k = 0 ; k <= 9 && k<=j ; k ++)
                    dp[i][j] += dp[i-1][j-k];
            }
        }
    }

    public long get(long idx){
        if(idx == 1)
            return 0;
        idx --;
        int sum = 0;
        for(int i = 1 ; i < 200 ; i++)
        {
            long value = dp[18][i];
            if(idx <= value){
                sum = i;
                break;
            }
            idx -= value;
        }

        long ret = 0;
        long len = 18;

        while(true)  {
        boolean flag = true;
        int start = 1;
        if(len != 18)
            start = -1;
        for(int i = start ; i <= 9 && i <= sum && flag; i++){
            long value = 0;
            if(i == -1) {
                if(sum ==0)
                    value = 1;
            }
            else
            for(int j = 0; j<=(len-1); j++){
                value += dp[j][sum-i];
            }
            if(idx <= value){
                if(i!= -1) {
                    ret = ret * 10 + i;
                    sum -= i;
                }

                if(idx == 1 && sum == 0)
                    return ret;

                len --;
                flag = false;
            }
            else{
                idx = idx - value;
            }
        }
        }
    }


}
