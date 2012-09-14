public class XorBoard {
    long mod = 555555555;

    int zhdp[][] = new int[3200][3200];

    public void init(int H, int W) {

        for(int i = 0 ; i < 3200; i ++) {
            zhdp[i][0] = 1;
            zhdp[i][i] = 1;
            if(i != 0)
                zhdp[i][1] = i;
        }

        for(int i = 1; i < 3200 ; i ++) {
            for(int j = 1; j < i ; j++) {
                zhdp[i][j] = (int)add(zhdp[i-1][j-1], zhdp[i-1][j]);
            }
        }
    }

    long add(long a, long b) {
        return (a+b)%mod;
    }

    long multi(long a, long b) {
        return (a*b)%mod;
    }

    long zh(long a, long b) {
        return zhdp[(int)a][(int)b];
    }


    public int count(int H, int W, int Rcount, int Ccount, int S) {
        init(H,W);
        long ret = 0;
        for(int r = 0; r <= Rcount && r <= H ; r++) {
            for(int c = 0; c <= Ccount && c <= W ; c++) {
                int count = r * W + c * H - 2 * r * c;
                if(count != S)
                    continue;
                if((Rcount - r)%2 != 0 || (Ccount -c)%2 != 0)
                    continue;
                long tmp = multi(zh(H, r), zh(W, c));
                int rleft = (Rcount - r)/2;
                int cleft = (Ccount - c)/2;

                tmp = multi(tmp, zh(H + rleft -1, rleft));
                tmp = multi(tmp, zh(W + cleft -1, cleft));

                ret = add(ret, tmp);
            }
        }

        return (int)ret;
	}
}
