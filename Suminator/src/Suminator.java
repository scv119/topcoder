import java.util.*;

public class Suminator {

    int program[];
    int pos;
    int wR;

	public int findMissing(int[] program, int wantedResult) {
		this.program = program;
        this.wR = wantedResult;
        for(int i = 0 ; i < program.length ; i ++) {
            if(program[i] == -1) {
                pos = i;
                break;
            }
        }

        int ret = -1;
        if(ok(0) == 0L )
            return 0;
        else {
            int start = 1;
            int end   = 1000000000;

            long sR = ok(start);
            long eR = ok(end);

            while(sR < 0 && eR > 0 && start < end) {
                int mid = (start + end) / 2;
                long mR = ok(mid);
                if(mR<0) {
                    sR = mR;
                    start = mid;
                }
                else {
                    eR = mR;
                    end = mid;
                }
            }

            if(sR == 0 )
                return start;
            if(eR == 0)
                return end;

        }

        return ret;

	}

    long ok(int value) {
        program[pos] = value;
        Stack<Long> stack = new Stack<Long>();
        for(int i = 0 ; i < program.length; i ++) {
            if(program[i] == 0) {
                long a; long b;
                a = stack.empty() ? 0 : stack.pop();
                b = stack.empty() ? 0 : stack.pop();
                stack.push(a + b);
            }
            else {
                stack.push(0L+program[i]);
            }
        }
        long ret = stack.empty() ? 0 : stack.pop();
        return ret - wR;
    }


}
