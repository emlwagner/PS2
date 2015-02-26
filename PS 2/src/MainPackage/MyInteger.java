package MainPackage;

// code written by user xterradaniel at http://www.dreamincode.net/forums/topic/189144-myinteger-class/
// was referenced for help with the implementation of the following code


public class MyInteger {

	// setting the variable value as private makes it only available in the
	// MyInteger class

	private int value;

	// this constructor will create an instance of MyInteger, using a specific
	// number for value

	public MyInteger(int value) {
		this.value = value;
	}

	// this allows access to the instance variable by methods outside of the class

	public int getValue() {
		return this.value;
	}

	// the first three methods are passed arguments with the data type int, and test
	// whether a number is even, odd, and prime

	public static boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(int number) {
		if (number % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(int number) {
		int divisor = 2;
		while (divisor <= number / 2) {
			if (number % divisor == 0) {
				return false;
			} else {
				divisor++;
			}
		}
		return true;
	}

	// the next three methods are passed arguments with the type MyInteger,
	// which creates a new instance of MyInteger
	// they call the getValue method, which returns number2 as an integer
	// then, they pass number2 to the isEven(), isOdd, and isPrime() functions

	public static boolean isEven(MyInteger number2) {
		int value = number2.getValue();
		return isEven(value);
	}

	public static boolean isOdd(MyInteger number2) {
		int value = number2.getValue();
		return isOdd(value);
	}

	public static boolean isPrime(MyInteger number2) {
		int value = number2.getValue();
		return isPrime(value);
	}

	// the next three methods also test if an argument is even, odd, and prime
	// however, an object needs to be created in order to use them
	// once an object is created, the argument passed to them is the instance
	// variable value

	public boolean isEven() {
		return (this.value % 2 == 0);
	}

	public boolean isOdd() {
		return (this.value % 2 != 0);
	}

	public boolean isPrime() {
		int divisor = 2;
		while (divisor <= this.value / 2) {
			if (this.value % divisor == 0) {
				return false;
			} else {
				divisor++;
			}
		}
		return true;
	}

	// this method tests if an integer, tester, is equal to the instance
	// variable value

	public boolean equals(int tester) {
		if (this.value == tester) {
			return true;
		}
		else {
			return false;
		}
	}

	// this method is passed an argument, new_value, of the type MyInteger, which
	// creates a new instance of MyInteger
	// it then calls the getValue method, which returns new_value as an integer assigned to value
	// it then calls the equals(int) method to test whether it is equal to the instance variable

	public static boolean equals(MyInteger new_value) {
		int value = new_value.getValue();
		return new_value.equals(value);
	}

	// this method is passed an argument consisting of an array of characters
	// it then converts the array into a string (str_array), and passes it to
	// the next method, where it will be converted to an integer, and returns an integer

	public static int parseInt(char[] array) {
		String str_array = new String(array);
		return Integer.parseInt(str_array);
	}

	// this method is passed an argument of the type String
	// it then uses a method of the Integer class to parse the string into an
	// integer, assigns it to str_to_int, and returns the integer

	public static int parseInt(String str_number) {
		int str_to_int = Integer.parseInt(str_number);
		return str_to_int;
	}
	
	public static void main(String[] args) {
		MyInteger number = new MyInteger(9);
		System.out.println(equals(number));
	}

}




