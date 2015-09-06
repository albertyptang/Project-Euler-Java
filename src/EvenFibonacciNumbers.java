
public class EvenFibonacciNumbers {
  
  int result (int num) {
    // 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
    int sum = 0;
    int first = 1;
    int second = 2;
    while (second < num) {
      sum += second;
      first += second; // 1 becomes 3
      second += first; // 2 becomes 5
    }
    return sum;
  }
  
  public static void main(String[] args) {
    System.out.print(new EvenFibonacciNumbers().result(4000000));
  }

}
