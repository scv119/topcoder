import java.io.*;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.StringTokenizer;

public class Test1 implements Runnable {


    Set<Long> digits;
    void solve() throws IOException {
        long n = readLong();

        long ret = 0;
         getdigits(n);
        long max = (long)(Math.sqrt(n));
        for(long i = 1 ; i <= max; i ++) {
            if(n%i!=0)
                continue;
            if(valid(i))
                ret ++;
            long j = n/i;
            if(j != i && valid(j))
                ret ++;
        }

        out.println(ret);

    }

    boolean valid(long x) {
        while(x != 0) {
            long ret = x%10;
            x = x/10;
            if(digits.contains(ret))
                return true;
        }
        return false;
    }

    void getdigits(long a) {
        String s = a + "";
        digits = new HashSet<Long>();
        for(int i = 0 ; i < s.length() ; i ++) {
            long value = s.charAt(i) - '0';
            digits.add(value);
        }

    }





    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new Test1().run();
    }

    public void run() {
        try {
            long t1 = System.currentTimeMillis();
            if (System.getProperty("ONLINE_JUDGE") != null) {
                in = new BufferedReader(new InputStreamReader(System.in));
                out = new PrintWriter(System.out);
            } else {
                in = new BufferedReader(new FileReader("input.txt"));
                out = new PrintWriter("output.txt");
            }
            Locale.setDefault(Locale.US);
            solve();
            in.close();
            out.close();
            long t2 = System.currentTimeMillis();
            System.err.println("Time = " + (t2 - t1));
        } catch (Throwable t) {
            t.printStackTrace(System.err);
            System.exit(-1);
        }
    }

    String readString() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    int readInt() throws IOException {
        return Integer.parseInt(readString());
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(readString());
    }


}