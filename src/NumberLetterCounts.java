import java.util.*;

/**
 * Created by aytang on 9/20/15.
 */
public class NumberLetterCounts {

    private static final int[] numbers = new int[]{
            1,2,3,4,5,6,7,8,9,10,
            11,12,13,14,15,16,17,18,19,
            20,30,40,50,60,70,80,90
    };

    private static final String[] words = new String[]{
            "one","two","three","four","five","six","seven","eight","nine","ten",
            "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen",
            "twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"
    };

    Map<Integer,String> english = new HashMap<>();
    {
        for (int i = 0; i < numbers.length; i++) {
            english.put(numbers[i], words[i]);
        }
    }

    String numberToWord(int number) {
        if (english.get(number) != null) {
            return english.get(number);
        } else if (number > 999) {
            int thousands = number/1000;
            int rest = number%(thousands*1000);
            if (rest == 0) {
                return numberToWord(thousands) + " thousand";
            } else if (rest > 99) {
                return numberToWord(thousands) + " thousand " + numberToWord(rest);
            } else {
                return numberToWord(thousands) + " thousand and " + numberToWord(rest);
            }
        } else if (number > 99) {
            int hundreds = number/100;
            int rest = number%(hundreds*100);
            if (rest == 0) {
                return numberToWord(hundreds) + " hundred";
            } else {
                return numberToWord(hundreds) + " hundred and " + numberToWord(rest);
            }
        } else if (number > 20) {
            int tens = number/10;
            int rest = number%(tens*10);
            if (rest != 0) {
                return numberToWord(tens*10) + "-" + numberToWord(rest);
            } else {
                return numberToWord(tens*10);
            }
        }
        return "";
    }

    int result(int start, int end) {
        if (end > 999999) {
            return 0;
        }
        int sum = 0;
        int count = start;
        while (count <= end) {
            String formattedWord= numberToWord(count).replaceAll("(\\s|-)","");
            sum += formattedWord.length();
            count++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new NumberLetterCounts().result(1,1000));
    }

}
