package hackerrankchallenges.JAVApractice;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);
        BigInteger n = ui.nextBigInteger();
        ui.close();
        System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
    }
}
