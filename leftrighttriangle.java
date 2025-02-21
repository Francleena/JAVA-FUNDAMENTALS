import java.util.*;

class leftAngleTriangle
{
	public int i,j;
	public void display()
	{
		int n = 5;
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}

	class rightAngleTriangle
	{
		public int i,j;
		public void display()
		{
			int n = 5;
			for (int i = 0; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

	class leftrighttriangle {
		public static void main (String[] args) {
			System.out.println("the left Angle Triangle is");
			leftAngleTriangle left = new leftAngleTriangle();
			left.display();
			System.out.println("the right Angle Triangle is");
			rightAngleTriangle right = new rightAngleTriangle();
			right.display();
		}
	}
