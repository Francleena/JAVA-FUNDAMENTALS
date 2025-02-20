public class Counter
{
    private static int count = 0;
    
    public Counter()
    {
        count++;
        System.out.println("object created : current count = "+count);
    }
    public static int getCount()
    {
        return count;
    }
    public static void main (String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        
    }
}