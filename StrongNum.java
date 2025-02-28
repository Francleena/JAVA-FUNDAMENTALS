import java.util.Scanner;
public class StrongNum
{
	public static void main(String[] args) {

		System.out.println("Strong number");
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		int num = in.nextInt();
		
		int sum=0,n=num;
		while(num>0)
		{
			int fact = 1;
			int digit=num%10;
			num=num/10;
            
			for(int i=1; i<=digit; i++)
			{
				fact *= i;
			}

            sum += fact;
            
		}
        if(sum==n)
        {
            System.out.println("its a strong num");
        }
        else
        {
            System.out.println("not a strong nu");
        }






	}
}