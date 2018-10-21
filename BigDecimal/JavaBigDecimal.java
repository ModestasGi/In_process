package hackerrankchallenges.JAVApractice;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();


        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                BigDecimal a = new BigDecimal(s1);
                BigDecimal b = new BigDecimal(s2);
                return b.compareTo(a); // descending order
            }
        };

        Arrays.sort(s, 0, n, customComparator);

        /*Arrays.sort(s,0,n,new Comparator<Object>(){
            public int compare(Object a1, Object a2) {
                BigDecimal bigDec1 = new BigDecimal((String)a1);
                BigDecimal bigDec2 = new BigDecimal((String)a2);
                return bigDec2.compareTo(bigDec1);
            }
        }); 1s62ms*/

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
