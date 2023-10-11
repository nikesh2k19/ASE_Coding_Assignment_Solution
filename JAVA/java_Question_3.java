/*  3. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabets
from a-z) */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();
        boolean isPangram = checkIfPangram(input);
        if (isPangram) {
            System.out.println("The entered sentence is a pangram.");
        } else {
            System.out.println("The entered sentence is not a pangram.");
        }
    }
    private static boolean checkIfPangram(String s) {
        Set < Character > alphabetSet = new HashSet < > ();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabetSet.add(ch);
        }
        for (char ch: s.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphabetSet.remove(ch);
            }
        }
        return alphabetSet.isEmpty();
    }
}