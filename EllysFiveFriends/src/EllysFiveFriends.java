import java.util.*;

public class EllysFiveFriends {
	Map<String,Integer> map = new HashMap<String,Integer>()  ;
    int m =  1000000007;




    public int getZero(int[] numbers) {
        String key = getKey(numbers);
        if(map.containsKey(key))
            return map.get(key);
        int result = 0;
        int sum = 0;
        for(int x:numbers)
            sum += x;
        if(sum == 0)
            return 1;
        long bigresult = 0;
        for(int i = 0 ; i < 5; i ++){
            if(numbers[i]%2==1 && numbers[(i+1)%5]%2 ==1){
                int[] clone = numbers.clone();
                clone[i]--;
                clone[(i+1)%5]--;
                bigresult += getZero(clone);
            }
            if(numbers[i]==0 || numbers[(i+1)%5]==0)
                continue;
            int[] clone = numbers.clone();
            clone[i]/=2;
            clone[(i+1)%5]/=2;
            bigresult += getZero(clone);
        }

        result = (int)(bigresult%m);
        map.put(key, result);
		return result;
	}



    public String getKey(int[] n){
        int max = 0;
        int idx = 0;
        for(int i = 0 ; i< 5; i ++)  {
            if(n[i] >= max){
                max = n[i];
                idx = i;
            }
        }

        boolean left = true;
        if(n[(idx+1)%5] > n[(idx -1 + 5)%5])
            left = false;
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < 5; i ++){
            int value = i;
            if(left)
                value *= -1;
            sb.append(n[(idx+value+5)%5]).append(";");

        }
      //  System.out.println(sb);
      //  System.out.println(sb);
        return sb.toString();
    }
}
