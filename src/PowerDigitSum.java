import java.math.BigInteger;

/**
 * Created by aytang on 9/19/15.
 */
public class PowerDigitSum {

    int result(int exponent) {
        BigInteger power  = new BigInteger("2").pow(exponent);
        String str = power.toString();
        System.out.println(str);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int num = (int) str.charAt(i) - '0';
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new PowerDigitSum().result(1000));
    }

}
