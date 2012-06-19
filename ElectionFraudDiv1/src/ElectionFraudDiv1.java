import java.util.*;

public class ElectionFraudDiv1 {
	public int MinimumVoters(int[] percentages) {
        int result = 0;
		for(int sum = 1; sum <= 1000 ; sum++){
            boolean all_find = true;
            int min_sum  =  0;
            int max_sum = 0;
            for(int j:percentages){
                double min_frac = j == 0 ? 0 : (j - 0.5d);
                min_frac = min_frac /100;

                double max_frac = j == 100 ? 100 : (j + 0.5d);
                max_frac = max_frac / 100;

                double min = min_frac * sum;
                double max = max_frac * sum;
                if(sum == 104)
                    System.out.println();

                if((int)max == (int)min && (min - (int)min) > 0)
                    all_find = false;
                if(((int)max - (int)min) == 1 && (min - (int)min) > 0 &&(max - (int)max) == 0 && max != sum )
                    all_find = false;


                if(all_find){
                    if(min == (int)min)
                        min_sum += (int)min;
                    else
                        min_sum += (int)min + 1;

                    if(max == (int)max && max == sum)
                        max_sum += sum;
                    else if(max == (int)max)
                        max_sum += (int)max - 1;
                    else
                        max_sum += (int)max;
                }
            }
            if(all_find && sum >= min_sum && sum <= max_sum)
                return sum;
        }
        return -1;
	}
}
