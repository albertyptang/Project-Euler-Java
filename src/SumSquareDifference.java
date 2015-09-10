/**
 * Created by aytang on 9/10/15.
 */
public class SumSquareDifference {

    int result(int num) {
        int SumSquare = 0;
        int Sum = 0;
        for (int i = 1; i <= num; i++) {
            SumSquare += Math.pow(i, 2);
            Sum += i;
        }
        return (int) Math.pow(Sum, 2) - SumSquare;
    }

    public static void main(String[] args) {
        System.out.println(new SumSquareDifference().result(100));
    }

}
