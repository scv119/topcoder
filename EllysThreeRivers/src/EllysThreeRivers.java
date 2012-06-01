import java.util.*;

public class EllysThreeRivers {
    int length;
    int walk;
    int[] width;
    int[] swim;
	public double getMin(int length, int walk, int[] width, int[] swim) {
        this.length = length;
        this.walk = walk;
        this.width = width;
        this.swim = swim;
		return solve(0,  length);
	}

    double solve(int river, double remain){
        double min = -1;
        if(river == 3)
            return remain/walk;
        double start = 0;
        double end = remain;
        for(int i = 0 ; i < 100 ; i ++){
            double mid = start + (end - start) / 3;
            double mid1 = end  - (end - start) / 3;
            double time = Math.sqrt(Math.pow(mid , 2) + Math.pow(width[river],2))/swim[river] + solve(river+1, remain - mid);
            double time1 = Math.sqrt(Math.pow(mid1 , 2) + Math.pow(width[river], 2))/swim[river] + solve(river+1, remain - mid1);
            if(time < time1)
                end = mid1;
            else
                start = mid;
            min = Math.min(time, time1);
        }
        return min;

    }

}
