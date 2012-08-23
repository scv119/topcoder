import java.util.*;

public class KingdomAndDucks {
	public int minDucks(int[] duckTypes) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:duckTypes){
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i,1);
        }

        int count = map.size();
        int max = 0;
        for(int v:map.values()){
            if(v > max)
                max = v;
        }
        return count * max;

	}
}
