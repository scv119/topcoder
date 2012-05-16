import java.util.*;

public class MergersDivTwo {
	public double findMaximum(int[] r, int k) {
		Arrays.sort(r);
        double[] arr = new double[r.length];
        double div = 1;
        for(int i = 0 ; i < r.length; i ++)
            arr[i] = r[i];
        int remain = (arr.length - 1 ) %(k - 1);
        return solve(arr, remain, k);
	}

    double solve(double[] r, int remain, int k){
        if(r.length == k + remain){
            double sum = 0;
            for(double x:r)
                sum += x;
            return sum/r.length;
        }

        double max = -1;
        for(int i = 0 ; i <= remain ; i++){
            double[] tmp = mt(r, k+i);
            double result = solve(tmp, remain - i, k);
            if(max == -1 || result > max)
                max = result;
        }
        return max;
    }


    double[] mt(double[] r, int n){
        double[] tmp = new double[r.length - n + 1];
        double sum = 0;
        for(int i = 0 ; i < r.length ; i ++){
            if(i < n ){
                sum += r[i];
            }
            if(i == n - 1){
                tmp[i - n + 1] = sum/n;
            }
            if(i >= n)
                tmp[i - n + 1] = r[i];
        }
        return tmp;
    }

}
