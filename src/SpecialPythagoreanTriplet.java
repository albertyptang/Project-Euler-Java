/**
 * Created by aytang on 9/10/15.
 */
public class SpecialPythagoreanTriplet {

    int result(int num) {
        int a, b;
        double c;
        for (a = 1; a < num - 2; a++) {
            for (b = 1; b < num - 2; b++) {
                c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
                if (a + b + c == num) {
                    System.out.println(a + " " + b + " " + c);
                    return a * b * (int) c;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new SpecialPythagoreanTriplet().result(1000));
    }
}
