import java.util.*;

public class EasyConversionMachine {
	public String isItPossible(String originalWord, String finalWord, int k) {
		int count = 0;
        for(int i = 0 ; i < originalWord.length(); i ++){
            if(originalWord.charAt(i) != finalWord.charAt(i)){
                count ++;
            }
        }
        int left = k - count;
        if(left >= 0 && left%2==0)
            return "POSSIBLE";
        return "IMPOSSIBLE";
	}
}
