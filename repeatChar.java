public class repeatChar {
    public static void main(String[] args) {
        String input = "f3ty6h";
        System.out.println(expandString(input));
    }

    public static String expandString(String input) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                int count = Character.getNumericValue(ch);
                
                int startIdx = i - 1;
                while (startIdx > 0 && !Character.isDigit(input.charAt(startIdx - 1))) {
                    startIdx--;
                }
                String repeatSegment = input.substring(startIdx, i);
                
                for (int j = 0; j < count - 1; j++) {
                    output.append(repeatSegment);
                }
            } else {
                output.append(ch);
            }
        }

        return output.toString();
    }
}
