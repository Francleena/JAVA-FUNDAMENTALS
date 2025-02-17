import java.util.Scanner;

public class Uniquenumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String Str = scanner.next();
        int[] count = new int[99];
        
        for (char digit : Str.toCharArray()) {
            count[digit - '0']++;
        }
        
        System.out.println("Unique numbers in the array are: ");
        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {
                System.out.println(i + " appears to be " + count[i] +" times" + " ");
            }
        }
        
        scanner.close();
    }
}
