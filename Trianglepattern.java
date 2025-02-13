import java.util.*;
public class Trianglepattern
{
	public static void main(String[] args) {
	    int n=9;
	    for (int i=1;i<=n;i++)
	    {
	        for(int j=n-i;j>=1;j--)
	        {
	            System.out.print(" ");
	        }
	        for(int k=1;k<=i;k++)
	        {
	            System.out.print("1");
	        }
	        for(int l=1;l<=i-1;l++)
	        {
	        System.out.print("1");
	        }
	        System.out.println();
	    }
	}
}
