import java.util.*;

public class PrinceXToastbook {
    double c(int n){
        double result = 1;
        for(int i = 1 ; i <= n ; i++){
            result/= i;
        }
        return result;
    }
	public double eat(int[] p) {
		double result = 0;
        for(int i = 0 ; i < p.length ; i++){
            if(p[i] == -1){
                result += 1;
            }
            else{
                int count = 1;
                int now = i;
                int limit = 51;
                while(p[now]!= -1){
                    now = p[now];
                    count ++;
                    if(count > limit)
                        break;
                }
                if(count < limit){
                    result += c(count);
                }
            }
        }
        return result;

	}
}
