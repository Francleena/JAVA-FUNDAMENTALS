import java.util.*;
public class Trianglepatternzero
{
	public static void main(String[] args) {
	    int n=5;
	    for (int i=1;i<=n;i++)
	    {
	        for(int j=n-i;j>=1;j--)
	        {
	            System.out.print(" ");
	        }
	        for(int k=1;k<=(2*i-1);k++)
	        if (k==1||k==(2*i-1)||i==n)
	        {
	        System.out.print("*");  
	        }
	        else{
	       System.out.print("0");
	        }
	        System.out.println();
	    }
	}
}