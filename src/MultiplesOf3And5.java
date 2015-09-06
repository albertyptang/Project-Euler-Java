
public class MultiplesOf3And5 {
  
  int result (int num) {
    int sum = 0;
    int i = 1;
    while (i*3 < num) {
      sum += i*3;
      if (i*5 < num) sum += i*5;
      i++;
    }
    return sum;
  }
  
  public static void main(String[] args) {
    System.out.print(new MultiplesOf3And5().result(1000));
  }
  
}
