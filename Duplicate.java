import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String numStr = scanner.next();
        
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[10];
        
        for (char digit : numStr.toCharArray()) {
            if (!seen[digit - '0']) {
                seen[digit - '0'] = true;
                result.append(digit);
            }
        }
        
        System.out.println("The output after removing duplicate elements is: " + result);
        scanner.close();
    }
}
