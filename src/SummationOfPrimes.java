/**
 * Created by aytang on 9/10/15.
 */
public class SummationOfPrimes {

    boolean prime(int num) {
        if (num == 2) return true;
        else if (num < 2 || num%2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i+=2) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }

    int result(int num) {
        int sum = 0;
        if (num > 2) {
            sum += 2;
        }
        for (int i = 3; i < num; i+=2) {
            if (prime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new SummationOfPrimes().result(2000000));
    }
}
