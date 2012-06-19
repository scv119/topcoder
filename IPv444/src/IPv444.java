import java.util.*;

public class IPv444 {

    class C{
        String request;
        int price;
        public C(String request, int price){
            this.request = request;
            this.price = price;
        }
    }

	public long getMaximumMoney(String[] request, int[] price) {
        List<C> list = new ArrayList<C>();
        for(int i = 0 ; i < request.length ; i ++){
            list.add(new C(request[i], price[i]));
        }
        Collections.sort(list, new Comparator<C>() {

            @Override
            public int compare(C c1, C c2) {
                return c1.price - c2.price;
            }
        });

		return 0;
	}
}
