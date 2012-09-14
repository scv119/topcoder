import java.io.*;
import java.util.Locale;
import java.util.StringTokenizer;

public class CosmicTables implements Runnable {



    void solve() throws IOException {
        int n = readInt();
        int m = readInt();
        int k = readInt();

        int g[][] = new int[n][m];
        for(int i = 0 ; i <  n ;i ++)
            for(int j = 0; j < m ; j++)
                g[i][j] = readInt();

        int nArr[] = new int[n];
        int mArr[] = new int[m];

        for(int i = 0; i < n; i ++)
            nArr[i] = i;
        for(int i = 0; i < m ; i++)
            mArr[i] = i;

        for(int iii = 0 ; iii < k ; iii++) {
            char c = readString().charAt(0);
            int a = readInt() - 1;
            int b = readInt() - 1;
            if(c == 'c') {
                swap(mArr, a, b);
            }

            else if(c == 'r') {
                swap(nArr, a, b);
            }
            else out.println(g[nArr[a]][mArr[b]]);
        }
    }

    void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }



    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new CosmicTables().run();
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