/**
 * Created by aytang on 9/10/15.
 */
public class TenThousandFirstPrime {

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
        if (num == 1) return 2;
        int counter = 1;
        int prime = -1;
        int i = 3;
        while (counter < num) {
            if (prime(i)) {
                counter++;
                prime = i;
            }
            i+=2;
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(new TenThousandFirstPrime().result(10001));
    }

}
