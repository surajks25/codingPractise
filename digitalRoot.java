import java.util.Scanner;
public class digitalRoot {
  public static void main(String[] args) {
        if(digit < 10) {
            return digit;
        }

        int currRoot = 0;

        while(digit > 0) {
            currRoot += digit % 10;
            digit /= 10;
        }

        return digitalRoot(currRoot);
    }
}
