class First3large
{
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6};
		int max = arr [0];
		int secondmax = Integer.MIN_VALUE;
		int thirdmax = Integer.MIN_VALUE;

		for (int i =1; i<arr.length; i++)
		{
			if (arr[i]>max)
				max = arr[i];
		}
		System.out.println(max);

		for (int i =0; i<arr.length; i++)
		{
			if (arr[i] > secondmax && arr[i] < max) {
				secondmax = arr[i];
			}
		}
		System.out.println(secondmax);

        for (int i =0; i<arr.length; i++)
		{
			if (arr[i] > thirdmax && arr[i] < secondmax) {
				thirdmax = arr[i];
			}
		}
		System.out.println(thirdmax);

	}
}





