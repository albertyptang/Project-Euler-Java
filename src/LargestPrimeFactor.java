
public class LargestPrimeFactor {

  boolean prime(long num) {
    if (num == 2) return true;
    else if (num < 2 || num%2 == 0) return false;
    for (long i = 3; i <= Math.sqrt(num); i+=2) {
      if (num%i == 0) {
        return false;
      }
    }
    return true;
  }

  long result (long num) {
    for (long i = 2; i <= num; i++) {
      if (num % i == 0 && prime(num/i)) {
        return num/i;
      }
    }
    return 1;
  }
  
  public static void main(String[] args) {
    System.out.print(new LargestPrimeFactor().result(600851475143L));
  }

}

