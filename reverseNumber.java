// Receive a number from user and reverse it without using any string manipulation
import java.util.Scanner;
public class reverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean isNeg = num < 0;
        if(isNeg) {
            num = -num;
        }

        int newNum = 0;
        while(num > 0) {
            newNum = (newNum * 10) + (num % 10);
            num /= 10;
        }
        if(isNeg) {
            System.out.println(-newNum);
        } else {
            System.out.println(newNum);

        }
    }}


