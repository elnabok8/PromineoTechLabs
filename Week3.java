
public class Week3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numberarray = {1, 5, 2, 8, 13, 6};
		System.out.println(numberarray[0]);
		System.out.println(numberarray[1]);
		//System.out.println(numberarray[6]); results in index out of bounds
		//System.out.println(numberarray[-1]); results in index out of bounds
		
		
		for (int i=0; i<numberarray.length; i++) {
		System.out.println(numberarray[i]);
		}
		
		for (int i : numberarray) {
			System.out.println(i);	
		}
	
		int sum =0;
		for (int number:numberarray) {
			sum+=number;
			System.out.println(sum);
		}
		
	
			
			double average = sum / numberarray.length;
			System.out.println(average);
			
			for (int number:numberarray) {
				if (number % 2 !=0) {
					System.out.println(number);
				}}
					String [] Namies = {"Sam", "Sally","Thomas", "Robert"};
					
					int totalletters=0;
					for (String name:Namies) {
						totalletters += name.length();
					}
					System.out.println("totalletters is " + totalletters);
	
					GreetingPrinter("Tom");
					GreetingPrinter ("Sally");
					String printthewholething = Greeter("Nick");
					System.out.println(printthewholething);
			
					System.out.println(isStringLongerThanNumber("Sid", 2));
			
					int array[] = {1,4,5,6,2};
	
	System.out.println(doesArrayContainString(Namies, "Sam"));

	double [] doubles = {55.6, 44.4, 77.9};
	System.out.println(calculateAverage(doubles));
		
	}

	public static void GreetingPrinter(String Name) {
		System.out.println("Hello, " + Name + "!");
	}
	public static String Greeter(String Name) {
		return "Hi, " + Name + "!";
		
		
	}
	public static boolean isStringLongerThanNumber(String string, int number) {
		if (string.length() > number) {
			return true;
		} else {
			return false;
			
		}
		
		
		
		
	}
	
	public static boolean doesArrayContainString(String[] array, String string) {
		for (String str : array) {
			if (str.equals(string)) {
				return true;
			}
		}return false;
		
	}
	
	public static int getSmallestNumber(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number<smallest) {
				smallest = number;
			}
		}
		return smallest;
		
			
	}
	
	public static double calculateAverage(double[]array) {
		double sum=0;
		for (double number :array) {
			sum += number;
			
		} return sum/array.length;
	
	}
	
}


			
		