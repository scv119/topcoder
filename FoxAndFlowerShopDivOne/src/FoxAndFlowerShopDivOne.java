import java.util.*;

public class FoxAndFlowerShopDivOne {
    int xLen;
    int yLen;
    int lG[][];
    int pG[][];
    int maxD;

    int getCount(int x1, int y1, int x2, int y2, boolean isL) {
        int arr[][] = lG;
        if(!isL) arr = pG;
        int ret = arr[x2][y2];
        if(x1 != 0) ret -= (arr[x1-1][y2]);
        if(y1 != 0) ret -= arr[x2][y1-1] ;
        if(x1 != 0 && y1 != 0) ret += arr[x1-1][y1-1];
        return ret;
    }

	public int theMaxFlowers(String[] flowers, int maxDiff) {
		xLen = flowers.length;
        yLen = flowers[0].length();
        maxD = maxDiff;

        lG = new int[xLen][yLen];
        pG = new int[xLen][yLen];

        int ret = -1;


        for(int i = 0; i < xLen; i++) {
            int lSize = 0, pSize = 0;
            for(int j =0; j < yLen; j++) {
                char c = flowers[i].charAt(j);
                if(c == 'L')
                    lSize ++;
                else if(c == 'P')
                    pSize ++;
                lG[i][j] = lSize;
                pG[i][j] = pSize;
                if(i > 0)                  {
                    lG[i][j] += lG[i-1][j];
                    pG[i][j] += pG[i-1][j];
                }
            }
        }

        ret = solve();

        return ret;
	}

    int solve() {
        int ret = -1;
        for(int bound = 0; bound < xLen - 1; bound ++) {
            Map<Integer, Integer> diff1 = new HashMap<Integer, Integer>();
            Map<Integer, Integer> diff2 = new HashMap<Integer, Integer>();
            for(int x1 = 0 ; x1 <= bound; x1 ++)
                for(int y1 = 0 ; y1 <yLen; y1 ++)
                    for(int x2 = x1; x2 <= bound; x2++)
                        for(int y2 = y1; y2 < yLen; y2++) {
                            int sum = getCount(x1,y1,x2,y2,true) + getCount(x1,y1,x2,y2,false);
                            int diff = getCount(x1,y1,x2,y2,true) - getCount(x1,y1,x2,y2,false);

                            if(!diff1.containsKey(diff) || diff1.get(diff) < sum)
                                diff1.put(diff, sum);
                        }

            for(int x1 = bound + 1 ; x1 < xLen; x1 ++)
                for(int y1 = 0 ; y1 <yLen; y1 ++)
                    for(int x2 = x1; x2 < xLen; x2++)
                        for(int y2 = y1; y2 < yLen; y2++) {
                            int sum = getCount(x1,y1,x2,y2,true) + getCount(x1,y1,x2,y2,false);
                            int diff = getCount(x1,y1,x2,y2,true) - getCount(x1,y1,x2,y2,false);

                            if(!diff2.containsKey(diff) || diff2.get(diff) < sum)
                                diff2.put(diff, sum);
                        }

            for(int d1:diff1.keySet())
                for(int d2:diff2.keySet()) {
                    if(Math.abs(d1 + d2) <= maxD )  ret = Math.max(ret, diff1.get(d1) + diff2.get(d2)) ;
                }
        }

        for(int bound = 0; bound < yLen - 1; bound ++) {
            Map<Integer, Integer> diff1 = new HashMap<Integer, Integer>();
            Map<Integer, Integer> diff2 = new HashMap<Integer, Integer>();
            for(int x1 = 0 ; x1 < xLen; x1 ++)
                for(int y1 = 0 ; y1 <= bound; y1 ++)
                    for(int x2 = x1; x2 < xLen; x2++)
                        for(int y2 = y1; y2 <= bound; y2++) {
                            int sum = getCount(x1,y1,x2,y2,true) + getCount(x1,y1,x2,y2,false);
                            int diff = getCount(x1,y1,x2,y2,true) - getCount(x1,y1,x2,y2,false);

                            if(!diff1.containsKey(diff) || diff1.get(diff) < sum)
                                diff1.put(diff, sum);
                        }

            for(int x1 = 0; x1 < xLen; x1 ++)
                for(int y1 = bound + 1  ; y1 <yLen; y1 ++)
                    for(int x2 = x1; x2 < xLen; x2++)
                        for(int y2 = y1; y2 < yLen; y2++) {
                            int sum = getCount(x1,y1,x2,y2,true) + getCount(x1,y1,x2,y2,false);
                            int diff = getCount(x1,y1,x2,y2,true) - getCount(x1,y1,x2,y2,false);

                            if(!diff2.containsKey(diff) || diff2.get(diff) < sum)
                                diff2.put(diff, sum);
                        }

            for(int d1:diff1.keySet())
                for(int d2:diff2.keySet()) {
                    if(Math.abs(d1 + d2) <= maxD )  ret = Math.max(ret, diff1.get(d1) + diff2.get(d2)) ;
                }
        }


        return ret;
    }


}
