import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.StringTokenizer;

public class DecodingGenome implements Runnable {

    long length;
    int count;
    int pair;

    static long MOD = 1000000007;

    long[][] power(long[][] matrix,  long count) {
        int len = matrix.length;
        long[][] ret = null;
        long[][] tmp = new long[len][len];
        deepCopy(matrix, tmp);
        while(count != 0) {
            if(count%2==1) {
                if(ret == null) {
                    ret = new long[len][len];
                    deepCopy(tmp, ret);
                } else {
                    ret = multi(ret, tmp);
                }
            }
            count = count/2;
            tmp = multi(tmp, tmp);
        }
        return ret;
    }

    void deepCopy(long m1[][], long m2[][]) {
        for(int i = 0 ; i < m1.length ; i++)
            for(int j = 0; j < m1[0].length; j++)
                m2[i][j] = m1[i][j];
    }

    long [][] multi(long m1[][], long m2[][]) {
        long ret[][] = new long[m1.length][m2[0].length];
        for(int i = 0 ; i < ret.length ; i ++)
            for(int j = 0 ; j < ret[0].length; j ++) {
                long value = 0;
                for(int k = 0; k < m2.length; k ++) {
                    value = add(value, multi(m1[i][k], m2[k][j]));
                }
                ret[i][j] = value;
            }
        return ret;
    }

    long add(long a, long b) {
        return ((0L + a + b)% MOD);
    }

    long multi(long a, long b) {
        return ((1L *a * b) %MOD);
    }



    void solve() throws IOException {
        length = readLong();
        count = readInt();
        pair = readInt();
        long badPair[][] = new long[count][count];
        long origin[][] = new long[1][count];
        Arrays.fill(origin[0], 1L);
        for(int i = 0 ; i < count; i ++)
            Arrays.fill(badPair[i], 1L);

        for(int i = 0; i < pair; i++) {
            String s = readString();
            char c = s.charAt(0);
            char c1 = s.charAt(1);
            int from = 0;
            int to   = 0;
            if(c >= 'a')
                from = c - 'a';
            else
                from = c - 'A' + 26;

            if(c1 >= 'a')
                to = c1 - 'a';
            else
                to = c1-'A' + 26;
            badPair[to][from] = 0;
        }


        long[][] result = origin;
        if(length >= 2) {
            result = multi(origin, power(badPair, length-1));
        }

        long sum = 0;
        for(int i = 0 ; i < count; i ++) {
            sum = add(sum, result[0][i]);
        }
        out.println(sum);
    }



    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new DecodingGenome().run();
    }

    public void run() {
        try {
            long t1 = System.currentTimeMillis();
            if (System.getProperty("ONLINE_JUDGE") != null) {
                in = new BufferedReader(new InputStreamReader(System.in));
                out = new PrintWriter(System.out);
            } else {
                in = new BufferedReader(new FileReader("/Users/shenchen/input.txt"));
                out = new PrintWriter("/Users/shenchen/output.txt");
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