import java.util.*;

public class ColorfulWolves {
    int N;
    int g[][];




	public int getmin(String[] colormap) {
		N = colormap.length;
        g = new int[N][N];
        for(int j = 0 ; j < N; j ++){
            int cnt = 0;
            String s= colormap[j];
            for(int i = 0 ; i < s.length() ; i ++){
                g[j][i] = -1;
                if(s.charAt(i) == 'Y'){
                    g[j][i] = cnt++;
                }
            }
        }
        for(int k = 0 ; k < N ; k ++)
            for(int i = 0; i < N; i ++)
                for(int j = 0 ; j< N ; j ++)
                   if(g[i][k] >= 0 && g[k][j] >= 0 && (g[i][j] < 0 || g[i][j] > (g[i][k] + g[k][j]) ))
                       g[i][j] = g[i][k] + g[k][j];

        return g[0][N-1];
	}
}
