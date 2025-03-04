public class revWhitespace {
    public static void main(String[] args) {
        
        String str = "        I Love     Java  ";

        String result = "";
        String word = "";

        for (int i = str.length() - 1; i >= 0; i--)
        {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word = ch+word;
            } 
            else if (word.length() > 0)
            {
                result = result + word + " ";
                word = "";
            }
        }

        if (word.length() > 0)
        
        {
            result = result + word;
        }

        System.out.println(result);
    }
}
