import java.io.*;
import java.util.*;

public class KString implements Runnable {

    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new KString().run();
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
        int arr[] = new int[26];
        int k;
        String s;
        k = readInt();
        s = readString();
//        k = 3;
//        s = "abcabcabz";

        for(int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            arr[c-'a'] ++;
        }

        boolean valid = true;

        for(int i = 0; i < 26; i ++) {
            if(arr[i]%k != 0) {
                valid = false;
                break;
            }
        }

        if(!valid)          {
            out.println(-1);
            return;
        }

        StringBuffer sb = new StringBuffer();
        for(int j = 0; j < k ;j ++)
            for(int i = 0; i < 26; i ++ ) {
                int count = arr[i]/k;
                for(int x = 0 ; x < count ; x++) {
                    sb.append((char)(i+'a'));
                }
            }
//        System.out.println(sb);
        out.println(sb.toString());


    }

}