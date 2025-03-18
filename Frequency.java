import java.util.Scanner;

public class Frequency
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String word[] = str.split(" ");
        int n = word.length;
        for(int i=0;i<n;i++)
        {
            if(word[i].equals(" "))
            continue;
            
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(word[i].equals(word[j]))
                {
                    count++;
                    word[j]=" ";
                }
            }
            System.out.println(word[i]+":"+count);
        }
    }
}