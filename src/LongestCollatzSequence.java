import java.util.*;

/**
 * Created by aytang on 9/13/15.
 */
public class LongestCollatzSequence {

    Map<Long,Integer> map = new HashMap<>();

    int lengthSolver(long n) {
        long nextValue;
        int length;
        if(map.containsKey(n)) {
            return map.get(n);
        } else {
            nextValue = (n%2 == 0) ? n/2 : 3*n+1;
            length = lengthSolver(nextValue);
            map.put(n, 1 + length);
            return 1 + length;
        }
    }

    int result(int n) {
        map.put(1L,1);
        int start = 1;
        int longestLength = 0;
        int longestStart = 0;
        while (start < n) {
            int length = lengthSolver(start);
            if (length > longestLength) {
                longestLength = length;
                longestStart = start;
            }
            start++;
        }
        return longestStart;
    }

    public static void main(String[] args) {
        System.out.println(new LongestCollatzSequence().result(1000000));
    }

}
