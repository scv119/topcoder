import java.util.*;

public class LeftRightDigitsGame2 {
    String dg;
    String lb;
	public String minNumber(String digits, String lowerBound) {
        this.dg = digits;
        this.lb  = lowerBound;
		int start = 0;
        int end   = digits.length() - 1;
        int lstart = 0;
        int lend = end;
        return solve(start, end, lstart, lend);
	}

    String solve(int start, int end, int lstart, int lend) {
        if(lstart == -1) {

        }
        return null;
    }
}
