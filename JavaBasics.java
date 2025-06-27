import java.util.*;
public class  JavaBasics{
    public static void main(String args[]){
        int n = 123456;
        int rev=0;
        while(n > 0){
            int lastDigit = n%10;
            n = n/10;
            // System.out.print(lastDigit);
            rev = rev * 10 + lastDigit;
        }

        System.out.println(rev);
    }
}