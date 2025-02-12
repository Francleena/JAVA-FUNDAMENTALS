public class Incredecre
{
	public static void main(String[] args) {
	    int x=10,v,z,a;
	    v = --x + x++ + ++x + --x + x++;
	    z = x++ + ++x + ++x + x++ + ++x;
	    a = --x + --x + --x + --x;
	    System.out.println (v);
	    System.out.println (z);
	    System.out.println (a);
	}
}