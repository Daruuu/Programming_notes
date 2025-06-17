import	java.util.Scanner;
import	java.util.Arrays;

class	HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world in Java");
		int	numOne = -123;
		System.out.println("this is num one value:" + numOne);

		String str = "Daruny";
		boolean result = str instanceof String;
		System.out.println("Is str an object of String?: " + result);

		int	daysFebruary = 29;
		String	res = (daysFebruary == 28) ? "not a leap year" : "leap year";
		System.out.println("Is leap year?: " + result);

		Scanner	input = new Scanner(System.in);

		System.out.println("Write a number:");
		/*
		int	number = input.nextInt();
		System.out.println("You entered " + number);

        // closing the scanner object
        input.close();
		System.out.println("ARRAYSSS:");
		String[]	array = new String[10];

		int i = 0;
		while(i <= array.length)
		{
			System.out.println(i);
			i++;
		}
		*/
		int[]	numbers = {1, 2,3,4,5,67,8};
		int []	array_nums = numbers;
		for (int n: array_nums)
		{
			System.out.println(n + ", ");
		}

		int [] source = {1, 2, 3, 4, 5, 6};
        int [] destination = new int[6];

        // iterate and copy elements from source to destination
        for (int i = 0; i < source.length; ++i) {
            destination[i] = source[i];
        }

         // converting array to string
        System.out.println(Arrays.toString(destination));

	}
}

