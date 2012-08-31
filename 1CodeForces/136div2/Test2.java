import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.StringTokenizer;

public class Test2 implements Runnable {



    void solve() throws IOException {
        int n = readInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];;
        for(int i = 0 ; i < n ;i ++) {
            arr[i] = readInt();
            arr1[i] = arr[i];
        }

        Arrays.sort(arr1);

        int diff = 0;
        for(int i = 0; i < n ;i ++) {
            if(arr[i] != arr1[i])
                diff++;
        }
        if(diff == 0 || diff == 2)
            out.println("YES");
        else
            out.println("NO");

    }

    boolean valid(int[] arr) {
        int now = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i ++) {
            if(arr[i] < now)
                return false;
            now = arr[i];
        }
        return true;
    }



    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new Test2().run();
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