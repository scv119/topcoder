import java.util.*;

public class ElectionFraudDiv2 {
	public String IsFraudulent(int[] percentages) {
        int len = percentages.length;
        int sum = 0;
        for(int i = 0 ; i < percentages.length; i ++){
            sum += percentages[i];
        }

        sum -= 100;
        if(sum <= (len/2) && sum >= 0)
            return "NO";
        if(sum <0 && (-1.0f * sum/len <0.5))
            return "NO";
        return "YES";
	}
}
