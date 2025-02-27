import java.util.Scanner;
public class Automorphic{
    public static void main (String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num");
        int num = in.nextInt();
        int square = num*num;
        int digit = String.valueOf(num).length();
        int lastDigit =square%(int)Math.pow(10,digit);
        
        if(lastDigit==num)
        {
            System.out.print("its an automorphic number");
        }
        else{
            System.out.println("not an automorphic number");
        }
        
        
        
    }
}