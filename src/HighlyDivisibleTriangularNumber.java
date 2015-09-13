/**
 * Created by aytang on 9/12/15.
 */
public class HighlyDivisibleTriangularNumber {

    long result(int n) {
        int i = 0;
        long triangular = 0;
        while (true) {
            i++;
            triangular += i;
            int factor = 0;
            for (int j = 1; j <= Math.sqrt(triangular); j++) {
                if (j == Math.sqrt(triangular)) {
                    factor++;
                } else if (triangular % j == 0) {
                    factor +=2;
                }
            }
            if (factor > n) {
                return triangular;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new HighlyDivisibleTriangularNumber().result(500));
    }
}
