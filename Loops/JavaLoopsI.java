package hackerrankchallenges.JAVApractice;

import java.util.Scanner;

public class JavaLoopsI {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i <= 10; i++)
            System.out.print(N + " x " + i + " = " + N * i + "\n");
    }

}