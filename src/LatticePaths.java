/**
 * Created by aytang on 9/13/15.
 */
public class LatticePaths {

    // DYNAMIC PROGRAMMING

    long result(int n) {
        long[][] grid = new long[n+1][n+1];
        grid[n][0]= 1;
        for (int y = 0; y <= n; y++) {
            for (int x = n; x>=0; x--) {
                long right = (x < n) ? grid[x+1][y] : 0;
                long down = (y > 0) ? grid[x][y-1] : 0;
                grid[x][y] += right + down;
            }
        }
        return grid[0][n];
    }

//// RECURSIVE
//
//    long total = 0;
//
//    void recursion(int x, int y, int n) {
//        if (x == n || y == 0) {
//            total++;
//        } else {
//            recursion(x, y-1, n);
//            recursion(x+1, y, n);
//        }
//    }
//
//    long result(int n) {
//        total = 0;
//        recursion(0, n, n);
//        return total;
//    }

    public static void main(String[] args) {
        System.out.println(new LatticePaths().result(20));
    }

}
