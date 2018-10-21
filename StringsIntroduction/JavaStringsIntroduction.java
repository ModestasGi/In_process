package hackerrankchallenges.JAVApractice;

import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        System.out.println(sumString(A, B));
        System.out.println(answer(A, B));
        System.out.println(capitalize(A, B));

    }

    private static int sumString(String A, String B){
        return A.length()+B.length();
    }
    private static String answer(String A, String B){
        if (A.compareTo(B) > 0){
            return "Yes";
        } else
        return "No";
    }
    private static String capitalize(String A, String B){
        String AC = A.substring(0, 1).toUpperCase() + A.substring(1);
        String BC = B.substring(0, 1).toUpperCase() + B.substring(1);
        return AC + " " + BC;
    }
}
