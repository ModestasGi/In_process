package hackerrankchallenges.JAVApractice;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        System.out.println(answers(A));
    }
    private static String answers(String A){
        if (A.equals(reverse(A))){
            return "Yes";
        } else return "No";
    }
    private static String reverse(String s){
        return new StringBuffer(s).reverse().toString();
    }
}
