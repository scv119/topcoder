import java.io.*;
import java.util.Locale;
import java.util.StringTokenizer;

public class Test11 implements Runnable {



    void solve() throws IOException {
        int n = readInt();
        int k = readInt() - 1;

        int arr[] = new int[n];
        for(int i = 0 ; i < n ;i ++) {
            arr[i] = readInt();
        }

        int value = 0;
        int count = 0;
        boolean valid = true;
        for(int i = k ; i < n ; i ++ ) {
            if(value != 0) {
                if(value != arr[i]) {
                    valid = false;
                    break;
                }
            }
            value = arr[i];
        }


        if(valid) {
            int idx = k - 1;
            while(idx >= 0) {
                if(arr[idx] != arr[k])
                    break;
                idx --;
            }
            count = idx + 1;

        }


        if(!valid)
            count = -1;
        out.println(count);

    }



    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new Test11().run();
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