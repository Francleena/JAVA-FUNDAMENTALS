import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String num = scanner.next();

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        char[] Arr = num.toCharArray();
        int length = Arr.length;

        for (int i = 0; i < length; i += n) {
            int left = i;
            int right = Math.min(i + n - 1, length - 1);
            
            while (left < right) {
                char temp = Arr[left];
                Arr[left] = Arr[right];
                Arr[right] = temp;
                left++;
                right--;
            }
        }
        
        System.out.println("Output: " + new String(Arr));
        
        scanner.close();
    }
}
