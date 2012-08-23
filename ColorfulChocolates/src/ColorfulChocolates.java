import java.util.*;

public class ColorfulChocolates {
    int maxSwaps;
    int[] c;
    int max = 0;
    int[] size;
    Map<Integer,List<Integer>> map;

	public int maximumSpread(String chocolates, int maxSwaps) {
		this.maxSwaps = maxSwaps;
        max = 0;
        c = new int[chocolates.length()];
        size = new int[26];
        for(int i = 0 ; i < c.length ; i ++){
            c[i] = chocolates.charAt(i)-'A';
            size[c[i]] ++;
        }
        map = new HashMap<Integer, List<Integer>>();
        for(int i = 0 ; i < 26; i ++){
            if(size[i] == 0)
                continue;
            if(size[i]>max)
                max = size[i];
            if(!map.containsKey(size[i]))
                map.put(size[i], new ArrayList<Integer>());
            map.get(size[i]).add(i);
        }

        int ret = 0;
        for(ret = max; ret >=2 ; ret -- ){
            if(ok(ret))
                return ret;
        }
        return 1;
	}

    boolean ok(int len){
        boolean ret = false;
        for(int oksize = max; oksize >= len; oksize --){
            if(!map.containsKey(oksize))
                continue;
            List<Integer> list = map.get(oksize);
            for(int c:list){
                if(ok1(c, len))
                    return true;
            }
        }
        return false;
    }

    boolean ok1(int type, int len){
        int arr[] = new int[len];
        int idx = 0;
        int arrlen = 0;
        for(int i = 0 ; i < c.length ; i ++){
            if(c[i] == type){
                if(arrlen < len){
                    arr[idx] = i;
                    idx = (idx + 1)%len;
                    arrlen ++;
                }
                else{
                    arr[idx] = i;
                    idx = (idx + 1)%len;
                }
                if(arrlen == len){
                    if(calc_swap(arr, idx) <= maxSwaps)
                        return true;
                }
            }
        }
        return false;
    }

    int calc_swap(int arr[], int start){
        int midvalue = arr.length/2;
        int mididx = arr[(start+arr.length/2)%arr.length];

        int ret = 0;
        for(int i = 0 ; i < arr.length ; i ++){
            ret += Math.abs(mididx-arr[(start+i)%arr.length]) - Math.abs(midvalue - i);
        }

        return ret;
    }
}
