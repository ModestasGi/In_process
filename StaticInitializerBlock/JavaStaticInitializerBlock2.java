package hackerrankchallenges.JAVApractice;

import java.util.Scanner;

public class JavaStaticInitializerBlock2 {

    public static void main(String[] args){

        Scanner ui = new Scanner(System.in);
        int B = ui.nextInt();
        int H = ui.nextInt();
        ui.close();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(B*H);
        }
    }
}
