package hackerrankchallenges.JAVApractice;

import java.util.Scanner;

public class JavaSubstringComparisons {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
    private static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i <= s.length() - k; i++) {
            String substr = s.substring(i,  i + k);
            if (substr.compareTo(smallest) < 0 || smallest.isEmpty()) {
                smallest = substr;
            }
            if (substr.compareTo(largest) > 0 || largest.isEmpty()) {
                largest = substr;
            }
        }
        return smallest + "\n" + largest;
    }
}
