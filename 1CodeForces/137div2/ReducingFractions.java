import java.io.*;
import java.util.*;

public class ReducingFractions implements Runnable {
    int max = 10001000;
    int[] zhiArr = new int[max];

    void prime() {
        Arrays.fill(zhiArr, 0);
        zhiArr[0] = zhiArr[1] = -1;
        for(int i = 2; i < max ; i ++)
            if(zhiArr[i] == 0) {
                for(int start = i + i ; start < max; start+= i) {
                    zhiArr[start] = i;
                }
            }
    }

    void solve() throws IOException {
        prime();
        int n = readInt();
        int m = readInt();

        int num[] = new int[max];
        int den[] = new int[max];

        for(int i = 0 ; i < n ; i ++) {
            dec(num, readInt());
        }

        for(int i = 0; i < m ; i ++) {
            dec(den, readInt());
        }

        List<Integer> nOut = new ArrayList<Integer>();
        List<Integer> mOut = new ArrayList<Integer>();

        for(int i =2 ; i < max; i ++) {
            long min = Math.min(num[i], den[i]);
            num[i] -= min;
            den[i] -= min;


            if(num[i] > 0) {
                long k = num[i];
                int value = i;
                int limit = (int)(Math.log(max)/Math.log(value))-1;
                if(limit <= 0)
                    limit = 1;
                while(k > 0) {
                    long count = 0;
                    if(k < limit) {
                        count = k;
                        k = 0;
                    } else {
                        k-= limit;
                        count = limit;
                    }

                    nOut.add((int)(Math.pow(value, count)));
                }
            }

            if(den[i] > 0) {
                long k = den[i];
                int value = i;
                int limit = (int)(Math.log(max)/Math.log(value))-1;
                if(limit <=0)
                    limit = 1;
                while(k > 0) {
                    long count = 0;
                    if(k < limit) {
                        count = k;
                        k = 0;
                    } else {
                        k-= limit;
                        count = limit;
                    }
                    mOut.add((int)(Math.pow(value, count)));
                }
            }


        }

        if(nOut.size() ==0)
            nOut.add(1);

        if(mOut.size() ==0)
            mOut.add(1);

        out.println(nOut.size()+" "+mOut.size());

        for(int i = 0 ; i < nOut.size() ;i ++) {
            if(i != 0)
                out.print(" ");
            out.print(nOut.get(i));
        }

        out.println();

        for(int i = 0 ; i < mOut.size() ;i ++) {
            if(i != 0)
                out.print(" ");
            out.print(mOut.get(i));
        }

        out.println();



    }

    void dec(int arr[], int value) {
        while(value != 1) {
            if(zhiArr[value]==0) {
                arr[value]++;
                value = 1;
            } else {
                arr[zhiArr[value]]++;
                value = value/zhiArr[value];
            }
        }
    }



    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new ReducingFractions().run();
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