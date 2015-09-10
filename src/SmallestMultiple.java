/**
 * Created by aytang on 9/9/15.
 */
import java.util.*;

public class SmallestMultiple {

    int result(int num) {
        int product = 1;
        ArrayList arr = new ArrayList();
        arr.add(1);
        for(int i = 2; i <= num; i++) {
            int dividend = i;
            for (int j = arr.size() - 1; j > 0 ; j--) {
                int factor = (int) arr.get(j);
                if (dividend%factor == 0) {
                    dividend = dividend / factor;
                }
            }
            product *= dividend;
            arr.add(dividend);
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.println(new SmallestMultiple().result(20));
    }
}
