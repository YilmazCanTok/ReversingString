; 
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String Değerini Giriniz : ");
        String str = scanner.nextLine();
        reverseString(str);

    }

    public static String reverseString(String str) {
        char[] charr = str.toCharArray();
        for (int i = charr.length-1 ; i >= 0; i--) {
            System.out.print(charr[i]);
        }
        String str2 = charr.toString();

        return str2;
    }
}