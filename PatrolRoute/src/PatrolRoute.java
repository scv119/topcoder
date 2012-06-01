import java.util.*;

public class PatrolRoute {
    int mod = 1000000007;
    long add(long x, long y){
        return (x + y)%mod;
    }
	public int countRoutes(int X, int Y, int minT, int maxT) {
        long result = 0;
		for(int x = 3; x <= X; x++)
            for(int y = 3; y <= Y; y ++){
                long count = 0;
                int distance = ((x-1) + (y-1))*2;
                if(distance >= minT && distance <= maxT){
                    count += (x-2) * (y -2) * 6;
                }
                count *= (X - x + 1) * (Y - y + 1);
                result = add(result, count);
            }
        return (int)result;

	}
}
