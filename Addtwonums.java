public class Addtwonums
{

	public static String addLargeNumbers(String num1, String num2) {
		StringBuilder result = new StringBuilder();

		int i = num1.length() - 1;
		int j = num2.length() - 1;
		int carry = 0;
		while (i >= 0 || j >= 0 || carry != 0) {
			int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
			int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

			int sum = digit1 + digit2 + carry;
			carry = sum / 10;
			result.append(sum % 10);

			i--;
			j--;
		}
		return result.reverse().toString();
	}
	
	public static void main(String[] args)
	{
		String num1 = "987654319";
		String num2 = "1234589687198798712221";
		String result = addLargeNumbers(num1, num2);
		System.out.println("Sum: " + result);
	}

}

