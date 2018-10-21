package hackerrankchallenges.JAVApractice;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    static int B, H;
    static boolean flag;

    static {
        Scanner reader = new Scanner(System.in);
        B = reader.nextInt();
        H = reader.nextInt();
        if (B <= 0 || H <= 0)
        {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else
            flag = true;
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class


