import sun.font.TrueTypeFont;

import java.util.*;

public class StrIIRec {
	public String recovstr(int n, int minInv, String minStr) {
        int []taken = new int[n];
        char[] result = new char[n];

        boolean exceed = false;
        int cur_inv = 0;
        for(int i = 0; i < n; i ++){
            int c_idx = 0;
            if(i < minStr.length() && exceed == false){
                c_idx = minStr.charAt(i) - 'a';
            }

            for(;c_idx <n ; c_idx++){
                if(taken[c_idx] == 1)
                    continue;
                int my_inv = 0;
                for(int j = 0 ; j < c_idx; j ++){
                    if(taken[j] == 0)
                        my_inv ++;
                }
                int ex_inv = cur_inv + my_inv + (n - i - 1) * (n - i - 2)/2;
                if(ex_inv >= minInv){
                    cur_inv += my_inv;
                    taken[c_idx] = 1;

                    result[i] = (char)('a' + c_idx);
                    if(!exceed && i < minStr.length() && result[i] != minStr.charAt(i))
                        exceed= true;
                    break;
                }
            }

        }

        return new String(result);
	}
}
