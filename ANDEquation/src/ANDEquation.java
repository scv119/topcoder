import java.util.*;

public class ANDEquation {
	public int restoreY(int[] A) {
		int result = -1;
        int len = A.length;
        for(int i = 0 ; i < len; i ++){
            int value = A[i];
            int tmp = -1;
            for(int j = 0; j < len; j ++){
                if(j == i)
                    continue;
                if(tmp == -1)
                    tmp = A[j];
                else
                    tmp = tmp & A[j];
            }
            if(tmp == value){
                result = value;
                break;
            }
        }
        return result;
	}
}
