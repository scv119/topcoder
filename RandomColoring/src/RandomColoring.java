import java.util.*;

public class RandomColoring {
    int maxR;
    int maxG;
    int maxB;
    double p[][][];
    double dp[][][];
    int pos[][][];

    int d1;
    int d2;

    double psum;

    int getCount(int r, int g, int b){
        int out = (Math.min(maxR, r + d2) - Math.max(0, r - d2) + 1)
                *(Math.min(maxG, g + d2) - Math.max(0, g - d2) + 1) * (Math.min(maxB, b+d2) - Math.max(0, b-d2) + 1);
        if(d1 != 0)
            out -= (Math.min(maxR , r + d1 - 1 ) - Math.max(0, r - d1 + 1) + 1) * (Math.min(maxG, g + d1 - 1) - Math.max(0, g - d1 + 1) + 1) * (Math.min(maxB, b + d1 -1) - Math.max(0, b - d1 + 1)+1);

        return out;
    }

    void calc(){

        double bb[] = new double[maxB+1];
        double gb[][] = new double[maxG+1][maxB+1];
        for(int r = 0 ; r <= maxR ; r ++){
            for(int g = 0 ; g <= maxG ; g ++){
                for(int b = 0; b<= maxB; b ++){
                    bb[b] = p[r][g][b]/psum/getCount(r,g,b);
                    if(b != 0)
                        bb[b] += bb[b-1];
                    gb[g][b] = bb[b];
                    if(g!=0)
                        gb[g][b] += gb[g-1][b];
                }
            }
            for(int g = 0 ; g <= maxG; g++)
                for(int b= 0 ; b<= maxB; b++){
                    dp[r][g][b] = gb[g][b];
                    if(r!=0)
                        dp[r][g][b] += dp[r-1][g][b];
                }
        }

        double sum = 0;
        for(int r = 0 ; r<= maxR; r++)
            for(int g = 0 ; g<= maxG; g++)
                for(int b = 0 ; b <= maxB; b++)
                {
                    p[r][g][b] = prob(Math.max(0,r-d2),Math.max(0,g-d2),Math.max(0,b-d2),Math.min(maxR,r+d2), Math.min(maxG, g+d2), Math.min(maxB, b+d2)) ;
                    if(d1 > 0)
                        p[r][g][b] -= prob(Math.max(0,r-d1+1),Math.max(0,g-d1+1),Math.max(0,b-d1+1),Math.min(maxR,r+d2-1), Math.min(maxG, g+d2-1), Math.min(maxB, b+d2-1)) ;
                    sum += p[r][g][b];
                }

        psum = sum;

    }

    double prob(int r1,int g1,int b1, int r2, int g2, int b2) {
        if(r1 > r2 || g1 > g2 || b1 > b2)
            return 0;


        double result = dp[r2][g2][b2];
        if(r1 > 0)
            result -= dp[r1-1][g2][b2];
        if(g1 > 0)
            result -= dp[r2][g1-1][b2];
        if(b1 >0)
            result -= dp[r2][g2][b1-1];

        if(r1 > 0 && g1 > 0)
            result += dp[r1-1][g1-1][b2];
        if(r1> 0 && b1 > 0)
            result += dp[r1-1][g2][b1-1];
        if(b1>0&&g1>0)
            result += dp[r2][g1-1][b1-1];

        if(r1 > 0 && g1 > 0 && b1 >0)
            result -= dp[r1-1][g1-1][b1-1];
        return result;
    }



	public double getProbability(int N, int maxR, int maxG, int maxB, int startR, int startG, int startB, int d1, int d2) {
		this.maxR = maxR; this.maxG = maxG; this.maxB = maxB; this.p = new double[maxR+1][maxG+1][maxB+1];this.d1 = d1;this.d2 = d2;
        this.dp = new double[maxR+1][maxG+1][maxB+1];
        this.pos = new int[maxR+1][maxG+1][maxB+1];
        this.psum = 1.0d;
        p[startR][startG][startB] = 1.0d;
        for(int i = 1; i < N ; i ++){

            calc();
            double rs = 0;
            if(i == 1) {
                for(int r = 0 ; r<= maxR; r++)
                    for(int g = 0 ; g<=maxG; g++)
                        for(int b = 0 ; b<=maxB;b++)
                            if(p[r][g][b] > 0) {
                                pos[r][g][b] = 1;
                                rs += p[r][g][b];
                            }
            }
        }

        double result = 1d;
        for(int r = 0 ; r <= maxR;r++)
            for(int g= 0 ; g <= maxG;g++)
                for(int b= 0 ; b<= maxB;b++){
                    if(pos[r][g][b] == 1)
                        result -= p[r][g][b];
                }
        return result;
	}
}
