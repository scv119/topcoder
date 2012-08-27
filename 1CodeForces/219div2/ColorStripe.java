import java.io.*;
import java.util.Locale;
import java.util.StringTokenizer;

public class ColorStripe implements Runnable {

    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new ColorStripe().run();
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
        int n = readInt();
        int k = readInt();
        String s = readString();

//        int n = 3;
//        int k = 2;
//        String s= "BBB";



        int ret;
        String sRet = "";
        if(k == 2) {
            int arr[] = new int[n];
            for(int i = 0 ; i < s.length() ; i ++) {
                arr[i] = s.charAt(i) - 'A';
            }

            int start0 = 0;
            int diff0  = 0;
            int start1 = 1;
            int diff1  = 0;
            for(int i = 0; i < n; i ++ ) {
                if(start0 != arr[i])
                    diff0 ++;
                if(start1 != arr[i])
                    diff1 ++;
                start0 = start0 ^ 1;
                start1 = start1 ^ 1;
            }

            int start = 0;
            if(diff1 < diff0)
                start = 1;

            StringBuffer sb = new StringBuffer();

            ret = Math.min(diff0,diff1);
            for(int i = 0 ; i < n ;i ++) {
                sb.append((char)('A'+start));
                start = start ^ 1;
            }

            sRet = sb.toString();
        }  else {
            ret = 0;
            char[] arr = s.toCharArray();
            for(int i = 1 ; i < arr.length ; i ++) {
                if(arr[i] != arr[i-1])
                    continue;
                ret ++;
                char pre = arr[i-1];
                char next = pre;
                if(i < arr.length - 1)
                    next = arr[i+1];

                char c = 'A';
                for(int off = 0; off < k ; off ++) {
                    c = (char)(off + 'A');
                    if(c != pre && c!=next)
                        break;
                }
                arr[i] = c;
            }
            sRet = new String(arr);


        }
//        System.out.println(ret);
//        System.out.println(sRet);

        out.println(ret);
        out.println(sRet);





    }

}