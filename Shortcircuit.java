public class Shortcircuit
{
	public static void main(String[] args) {
	    int a=5,b=6,c=8;
	    if(a>b&&a>c)
	    {
	        System.out.println("a is greatest");
	    }	
	    else if (b>c) 
	    {
	        System.out.println("b is greatest");
	    }
	    else
	    {
	      	System.out.println("c is greatest");
	    }
	}
}
