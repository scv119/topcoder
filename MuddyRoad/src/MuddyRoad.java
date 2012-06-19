import java.util.*;

public class MuddyRoad {
	public double getExpectedValue(int[] road) {
        double peven = 0;
        double podd  = 0;
        double pzero = 1;
        double result = 0;
		for(int i = 1 ; i < road.length; i ++){
            double p = road[i]/100d;
            double tmp_podd = (peven + pzero) * p;
            double tmp_peven = podd * p;
            pzero = 1 - p;
            peven = tmp_peven;
            podd = tmp_podd;
            result += peven;
        }
        return result;
	}
}
