import java.util.*;

public class KingXMagicSpells {
    double dp[][][] = new double[52][52][2];
	public double expectedNumber(int[] ducks, int[] spellOne, int[] spellTwo, int K) {
		double exp[] = new double[31];
        int spell[] = new int[K+1];
        spell[0] = 0;
        for(int i = 1; i <= K ; i ++){
            int idx = spell[i-1];
            for(int j = 0 ; j< spellTwo.length ; j++)
                if(spellTwo[j] == idx)
                {
                    spell[i] = j;
                    break;
                }
        }


        int mask = 0;
        for(int i = 1; i<= 31; i ++){
            clear();
            mask = 1 << (i-1);
            if((mask & ducks[0]) == mask)
                dp[0][0][1] = 1;
            for(int j = 1; j <= K ; j ++){
                for(int s1 = 0; s1<=j; s1 ++){
                    int s2 = j - s1;


                }
            }

        }
	}

    void clear(){
        for(int i = 0 ; i < 52; i ++)
            for(int j = 0 ; j < 52 ; j++)
                Arrays.fill(dp[i][j],0);
    }

}
