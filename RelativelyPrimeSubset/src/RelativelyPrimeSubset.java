import java.util.*;

public class RelativelyPrimeSubset {
    int len;
    int g[][];
    int dp[];
    int max;
    boolean found;

	public int findSize(int[] S) {
        len = S.length;
        g = new int[len][len];
        dp = new int[len];

        for(int i = 0 ; i < len; i ++)
            for(int j  =0  ;j < len ;j ++){
                if(i!=j && gcd(S[i],S[j])== 1)
                    g[i][j] = g[j][i] = 1;
            }

		return  solve();
    }

    int gcd(int a, int b){
        return a==0? b : gcd(b%a, a) ;
    }

    int solve(){
        dp[len-1] = 1;
        max = 1;
        for(int i = len - 2; i >= 0; i --){
            found = false;
            List<Integer> nodes = new LinkedList<Integer>();
            for(int j = i + 1; j < len ; j++){
                if(g[i][j] == 1)
                    nodes.add(j);
            }
            clique(nodes,1);
            dp[i] = max;
        }
        return dp[0];
    }

    void clique(List<Integer> nodes, int size){
         if(nodes.size() == 0)
         {
             if(size > max)
             {
                 max = size;
                 found = true;
             }
             return;
         }

         while(nodes.size()>0){
             if(nodes.size() + size <= max)
                 break;
             int node = nodes.remove(0);
             if(size + dp[node]<= max)
                 break;
             List<Integer> n_nodes = new LinkedList<Integer>();
             for(int i:nodes){
                 if(g[i][node] == 1)
                     n_nodes.add(i);
             }
             clique(n_nodes, size + 1);
             if(found)
                 break;
         }
    }
}
