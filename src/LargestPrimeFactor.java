
public class LargestPrimeFactor {
  
  boolean primeChecker (long num) {
    for (long i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0 ) return false;
    }
    return true;
  }
  
  long result (long num) {
    for (long i = 2; i <= num; i++) {
      if (num % i == 0 && primeChecker(num/i)) {
        return num/i;
      }
    }
    return 1;
  }
  
  public static void main(String[] args) {
    System.out.print(new LargestPrimeFactor().result(600851475143L));
  }

}

