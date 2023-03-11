package test;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
		
		while (num <= 10) {
			System.err.println(num);
			num++;
		}
		
		System.err.println("End of loop first");
		
		int num1 = 10;
		
		while (num1 > 0) {
			
			if (num1==5) {
				System.out.println("Skip");
				num1--;
				continue;
			}
			System.err.println(num1);
			num1--;
		}
		
		System.out.println("End of loop second");

	}

}
