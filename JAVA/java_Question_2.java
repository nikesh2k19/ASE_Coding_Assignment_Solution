// 2. Enter Roman Number as input and convert it to integer. (ex IX = 9)

import java.util.HashMap;
import java.util.Scanner;
public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();
        int result = romanToInteger(romanNumeral);
        System.out.println("The equivalent integer is: " + result);
    }
    private static int romanToInteger(String s) {
        HashMap < Character, Integer > romanValues = new HashMap < > ();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentValue = romanValues.get(s.charAt(i));
            if (i < s.length() - 1) {
                int nextValue = romanValues.get(s.charAt(i + 1));
                if (currentValue < nextValue) {
                    result += nextValue - currentValue;
                    i++; // Skip the next character since it has already been considered
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }
        return result;
    }
}