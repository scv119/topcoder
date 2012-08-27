import java.io.*;
import java.util.Locale;
import java.util.StringTokenizer;

public class SpOffer implements Runnable {

    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new SpOffer().run();
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

    // solution

    void solve() throws IOException {
        long p = readLong();
        long d = readLong();
//        long p = 9999811;
//        long d = 0;

        long len = (p + "").length();
        long result = p;
        for(long count = 1,radix = 10; count <= len; count ++,radix*=10) {
            long remain = p%radix;
            if(remain == radix - 1) {
                result = p;
                continue;
            }
            long tmp = p/radix;
            if(tmp == 0){
                continue;
            }
            tmp = (tmp - 1) * radix + (radix-1);
            long diff = p - tmp;
            if(diff <= d) {
                result = tmp;
            }
        }

//        System.out.println(result);
        out.println(result);


    }

}