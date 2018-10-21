package hackerrankchallenges.JAVApractice;

import java.util.Scanner;

public class JavaAnagramsAccepted {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    private static boolean isAnagram(String a, String b) {
        // Complete the function
        String f = a.toLowerCase();
        String s = b.toLowerCase();

        return sort(f) == sort(s);
    }

    private static int sort(String s) {
        int r = 0;
        for (int i = 0; i < s.length(); i++) {
            r += s.charAt(i) % 5;
        }
        return r;
    }
}
