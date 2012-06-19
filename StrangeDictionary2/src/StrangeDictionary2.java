import java.util.*;

public class StrangeDictionary2 {
	int word_size;
    int word_len ;
    String[] words;
    int [][][] dp;
    double dp1[][];
    public double[] getProbabilities(String[] words) {
        word_size = words.length;
        word_len  = words[0].length();


        int dp_size = 1;
        int mask    = 0;
        for(int i = 0 ; i < word_size; i ++)
        {
            dp_size = dp_size << 1;
            mask = mask | (1 << i);
        }
        this.words = words;
        dp1 = new double[dp_size][word_size];
        dp = new int[word_len][dp_size][2];

        for(int i = 0 ; i < dp_size; i ++)
            Arrays.fill(dp1[i],-1);

        double[] result = new double[word_size];

        for(int word_idx = 0; word_idx < word_size; word_idx ++){
            for(int i = 0 ; i< word_len; i ++)
                for(int j = 0 ; j < dp_size; j ++)
                    Arrays.fill(dp[i][j], 0);
            build_dp(word_idx);
            result[word_idx] = calc(word_idx,mask,0);
        }
        return result;
	}


    int[] build_dp(int idx){
        Set<Integer> next = new HashSet<Integer>();
        next.add(0);
        for(int len = 1; len <= word_len ; len ++){
            for(int c = 0 ; c < word_len ; c ++){

            }
        }
    }


    double calc(int idx, int word_mask, long column_mask){
//        System.out.println(idx+" "+word_mask);
        if(dp1[word_mask][idx]!=-1) {
            return dp1[word_mask][idx];
        }
        double result = 0;
        long c_mask = 1;
        int count = 0;
        for(int c = 0 ; c < word_len ; c ++){

            if((c_mask & column_mask) == c_mask)
            {
                c_mask = c_mask << 1;
                continue;
            }

            int new_mask = dp[c][word_mask][0];
            int match_size = dp[c][word_mask][1];
            double pro = 0;

            if(match_size > 0){
                if(match_size == 1){
                    pro = 1;
                }
                else{
                    pro = calc(idx, new_mask, column_mask|c_mask);
                }
            }
            result += pro;
            c_mask = c_mask << 1;
            count ++;
        }
        dp1[word_mask][idx] = result/count;
        return result/count;
    }

}
