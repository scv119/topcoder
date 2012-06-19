import java.util.*;

public class Spacetsk {
    int mod = 1000000007;
    long bi[][];
    int  freq[];

    int gcd(int i, int j){
        return i == 0 ? j : gcd(j%i, i);
    }


	public int countsets(int L, int H, int K) {
        freq = new int[Math.max(L, H)+2];
        long result = 0;
        if(K == 1)
            return (L+1) * (H+1);
        freq[H+1] = L + 1;
        for(int dx = 1; dx <= L; dx ++)
            for(int dy = 1; dy <= H ; dy ++){
                if(gcd(dx,dy) != 1)
                    continue;
                int sig_y = H/dy + 1;
                for(int d = 0 ; d <= L/dx; d++){
                    int count = Math.min(L - d * dx + 1,dx );
                    int sig_x = d + 1;
                    freq[Math.min(sig_y,sig_x)] += count * 2;
                }
            }

        bi = new long[H+2][H+2];
        for(int i = 1 ; i <= H + 1; i ++ )
        {
            bi[i][1] = i;
            bi[i][i] = 1;
        }
        for(int i = 2; i <= H + 1; i ++){
            for(int j = 2; j < i ; j ++){
                bi[i][j] = (bi[i-1][j-1] + bi[i-1][j])%mod;
            }
        }

        for(int idx = K; idx < freq.length && idx < H + 2 ; idx++){
            result = (int)((result + bi[idx][K] * (freq[idx] %mod)) %mod);
        }

        return (int)result;


	}
}
