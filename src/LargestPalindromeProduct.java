/**
 * Created by aytang on 9/9/15.
 */
public class LargestPalindromeProduct {

    boolean palindrome(int num) {
        String str = Integer.toString(num);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            } else if (i == str.length() - 1 - i) {
                // stop the loop upon reaching the middle
                break;
            }
        }
        return true;
    }

    int result() {
        int product = -1;
        for(int i = 999; i >= 100; i--) {
            for (int j = i; j>= 100; j--) {
                if(i*j < product) {
                    // stop the loop if i*j will always be < product
                    break;
                } else if (palindrome(i*j)) {
                    product = i*j;
                }
            }
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.println(new LargestPalindromeProduct().result());
    }

}
