package test;

public class PrimeNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 117  ;

		boolean flag = true;

		for (int i= 2; i<num/2; i++) {

			int rem = num%i;

			if (rem == 0) {
				flag = false;
				break;
			}
		}

		if (flag == true) {
			System.out.println("num is prime num");
		} else {
			System.out.println("num is not a prime num");
		}

	}

}
