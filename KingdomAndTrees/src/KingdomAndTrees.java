import java.util.*;

public class KingdomAndTrees {
    int ret = 0;
    int len;
    int h[];
	public int minLevel(int[] heights) {
		len = heights.length;
        h = heights;
        int left = 0;
        int right = 1000000000;
        if(ok(left))
            return left;
        while(left+1<right){
            int mid = (left + right)/2;
            if(ok(mid))
                right = mid;
            else
                left = mid;
        }
        return right;
	}

    boolean ok(int value){
        int pre = 0;
        for(int x:h){
            int min = Math.max(1,x-value);
            int max = x + value;
            pre = pre + 1;
            if(pre < min)
                pre = min;
            else if(pre > max)
                return false;

        }
        return true;
    }
}
