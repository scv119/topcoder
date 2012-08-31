import java.io.*;
import java.util.*;

public class Test3 implements Runnable {

    public static class Interval implements Comparable{

        int idx;
        int start;
        int end;

        @Override
        public int compareTo(Object o) {
            return this.start - ((Interval)o).start;
        }
    }



    void solve() throws IOException {
        int n = readInt();
        int m = readInt();

        int result[] = new int[m];
        Interval[] query = new Interval[m];

        long arr[] = new long[n];
        for(int i = 0 ;i < n ; i ++) {
            arr[i] = readLong();
        }


        for(int i = 0 ; i < m ; i ++) {
            int start = readInt();
            int end   = readInt();
            query[i] = new Interval();
            query[i].start = start;
            query[i].end   = end;
            query[i].idx   = i;

        }

        Map<Long,Long> map = new HashMap<Long,Long>();
        for(long x:arr) {
            if(!map.containsKey(x))
                map.put(x,1L);
            else
                map.put(x, map.get(x) + 1);
        }

        Set<Long> valid = new HashSet<Long>();
        for(long key:map.keySet()) {
            long value = map.get(key) ;
            if(value >= key)
                valid.add(key);
        }

        int dp[] = new int[n];
        for(long x:valid) {
            Arrays.fill(dp, 0);
            for(int i = 0 ; i < n ;i ++) {
                if(arr[i] == x)
                    dp[i] = 1;
                if(i != 0)
                    dp[i] += dp[i-1];

                if(dp[i] < x)
                    continue;

            }

            for(Interval interval:query) {
                long value = dp[interval.end - 1];
                if(interval.start != 1)
                    value -= dp[interval.start-2];
                if(value == x)
                    result[interval.idx] ++;
            }
        }

        for(int i = 0 ; i < result.length ; i ++) {
            out.println(result[i]);
        }

    }



    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new Test3().run();
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