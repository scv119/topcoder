import java.io.*;
import java.util.*;

public class Test4 implements Runnable {

    int offset[] = new int[2];

    public static class Diff implements Comparable{
        int type;
        int value;
        int idx;

        @Override
        public int compareTo(Object o) {
            return value - ((Diff)o).value;
        }
    }



    void solve() throws IOException {
        int n = readInt();
        int idx1[] = new int[n+1];
        int arr1[] = new int[n];
        int arr2[] = new int[n];

       for(int i = 0 ; i < n ;i ++) {
           arr1[i] = readInt();
           idx1[arr1[i]] = i;
       }

       for(int i = 0 ; i < n ; i++) {
           arr2[i] = readInt();
           int diff = i - idx1[arr2[i]];
       }
    }



    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new Test4().run();
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