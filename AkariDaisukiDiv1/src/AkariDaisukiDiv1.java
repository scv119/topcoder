import java.util.*;

public class AkariDaisukiDiv1 {
    int mod = 1000000007;
	public int countF(String l, String m, String r, String x, String F, int k) {
        x = f(l,m,r,x);
        k --;

        String ll = "";
        String mm = "";
        String rr = "";

        int count = match(x,F);;
		while(k > 0)
        {
            ll = ll + l;
            rr = rr + r;
            mm = rr + m + ll;


            if(ll.length() >= F.length() && mm.length() >= F.length())
                break;

            count = 2 * count + match(ll,F) + match(mm, F) + match(rr, F);
            k --;
        }
        double result = 0;
        if(ll.length() >= F.length() && mm.length() >= F.length()) {
            int top_count = match(l +ll.substring(F.length()-1), F);
            int mid_count = match(rr.substring(rr.length() - F.length() + 1,rr.length()) + m + ll.substring(F.length()-1), F);
            int end_count = match(rr.substring(rr.length() - F.length() + 1, rr.length()) + r, F);

            if(k > 0)
            result =  (top_count + mid_count + end_count) * (Math.pow(2,k-1)-1);
        }

        result += count * Math.pow(2,k);

        return (int)result;
	}

    String f(String l, String m, String r, String x){
        return l + x + m + x + r;
    }

    int match(String x, String y){
        if(x.length() < y.length())
            return 0;
        int result = 0;
        for(int i = 0 ; i < x.length() ; i ++){
            if(i + y.length() > x.length())
                break;
            if(x.subSequence(i,i+y.length()).equals(y))
                result ++;
        }
        return result;
    }

}
