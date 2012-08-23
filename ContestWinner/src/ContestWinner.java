import java.util.*;

public class ContestWinner {
	public int getWinner(int[] events) {
		int max = -1;
        int max_idx = -1;
        Map<Integer,Integer> map  = new HashMap<Integer,Integer>();
        for(int i :events){
            if(!map.containsKey(i))
                map.put(i,1);
            else
                map.put(i,map.get(i)+1);
            if(map.get(i) > max){
                max = map.get(i);
                max_idx = i;
            }

        }
        return max_idx;
	}
}
