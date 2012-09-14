import java.util.*;

public class XorTravelingSalesman {
    int max = 0;
    int g[][];
	public int maxProfit(int[] cityValues, String[] roads) {
		int visited[][] = new int[50][1024];
        g = new int[roads.length][roads.length];
        for(int i = 0; i < roads.length; i ++) {
            String s = roads[i];
            for(int j = 0; j<roads.length; j++) {
                char c = s.charAt(j);
                if(c == 'Y')
                    g[i][j] = g[j][i] = 1;
            }
        }


        int current = 0;
        int  value   = 0;

        current = 0;
        value   = cityValues[0];
        max  = value;

        visited[current][value] = 1;
        Queue<Object[]> q = new LinkedList<Object[]>();
        q.add(new Object[]{current, value});

        while(q.size()>0) {
            Object[] list = q.poll();
            int  pos = (Integer)list[0];
            int  v   = (Integer)list[1];
            for(int i = 0 ; i < g.length ; i ++) {
                if(g[pos][i] == 1) {
                    int  npos = i;
                    int  nv    =v^cityValues[i];
                    max = Math.max(max, nv);

                    if(visited[npos][nv] == 0) {
                        visited[npos][nv] = 1;
                        q.add(new Object[]{npos, nv});
                    }
                }
            }
        }
        return max;
	}


}
