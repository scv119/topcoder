import java.util.*;

public class EllysTSP {
	public int getMax(String places) {
		int c = 0;
        int v = 0;
        for(int i = 0 ; i < places.length(); i++){
            char cc = places.charAt(i);
            if(cc == 'C')
                c++;
            else
                v++;
        }
        if(c == v)
            return c + v;
        return Math.min(c, v) * 2 + 1;
	}
}
