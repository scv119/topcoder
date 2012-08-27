import java.io.*;
import java.util.*;

public class ParkingLot implements Runnable {

    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new ParkingLot().run();
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

    public class Interval implements Comparable {
        int start;
        int end;
        int size;
        int nextPlace;

        public Interval(int start, int end) {
            this.start = start;
            this.end   = end;
            this.size = 0;
            this.nextPlace = -1;
            int realsize = end - start - 1;
            if(realsize > 0){
                if(start != 0 && end != n + 1){
                    this.size = 1 + (realsize-1)/2;
                    this.nextPlace = start + this.size;
                }
                else if(start == 0) {
                    this.size = end - 1;
                    this.nextPlace = 1;
                }
                else {
                    this.nextPlace = n;
                    this.size = n - start;
                }
            }
        }


        @Override
        public int compareTo(Object o) {
            Interval to = (Interval) o;
            int ret = (to.size - this.size);
            if(ret != 0)
                return ret;
            return(this.start - to.start);
        }
    }


    PriorityQueue<Interval> pq = new PriorityQueue<Interval>();
    Map<Integer,Interval> startMap = new HashMap<Integer,Interval>();
    Map<Integer,Interval> endMap   = new HashMap<Integer, Interval>();
    Map<Integer,Integer>  carMap  = new HashMap<Integer, Integer>();
    int n ;
    int m;

    void add(Interval interval) {
        pq.add(interval);
        startMap.put(interval.start, interval);
        endMap.put(interval.end, interval);
    }

    Interval remove(Interval it) {
        pq.remove(it);
        startMap.remove(it.start);
        endMap.remove(it.end);
        return it;
    }


    void solve() throws IOException {
        n = readInt();
        m = readInt();
        Interval it = new Interval(0, n+1);
        add(it);
        for(int i = 0 ; i < m; i ++) {
            int action = readInt();
            int car    = readInt();
            if(action == 1) {
                Interval interval= pq.poll();
                remove(interval);
                out.println(interval.nextPlace);
                carMap.put(car, interval.nextPlace);
                Interval left = new Interval(interval.start,  interval.nextPlace);
                Interval right =new Interval(interval.nextPlace, interval.end);
                add(left);
                add(right);
            }
            else {
                int place = carMap.remove(car);
                Interval left = endMap.get(place);
                Interval right = startMap.get(place);
                remove(left);
                remove(right);
                Interval interval = new Interval(left.start, right.end);
                add(interval);
            }
        }

    }

}
