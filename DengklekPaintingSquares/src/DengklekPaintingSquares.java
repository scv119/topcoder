import java.util.*;

public class DengklekPaintingSquares{
    public int numSolutions(int n , int m){
        int max = 1 << m;
        int all[] = new int[max];
        for(int i = 0 ; i<max ; i++){
            all[i] = (((i << 1) ^ (i >> 1)) & i);
        }

    }

}