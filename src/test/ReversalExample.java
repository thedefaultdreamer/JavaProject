package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "racecar";

		String result = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			result = result + s.charAt(i);
		}

		System.out.println("Reversed string is: " + result);

		if (s.equalsIgnoreCase(result)) {
			System.out.println("The given string is palindrom");
		} else {
			System.out.println("The given string is not palindrom");
		}
		
		//==================================================
		
		String s1 = "My name is Palash";
		
		String[] arr = s1.split(" ");
		
		String result1 = "";
		
		for(int i=arr.length-1; i>=0; i--) {
			result1 = result1+arr[i]+" ";
		}
		
		System.out.println("The result is " + result1.trim());
	}

}
