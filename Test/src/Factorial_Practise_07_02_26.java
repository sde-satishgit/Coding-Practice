import java.util.Scanner;

public class Factorial_Practise_07_02_26 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int inpNo = sc.nextInt();
		
		int result = checkFactorial(inpNo);
		
		System.out.println("result = " + result );
		sc.close();

	}

	private static int checkFactorial(int inpNo) {
		
		int add = 1;
		for(int i=inpNo;i>=1;i--) {
			add = add * i;
		}
		return add;
	}

}
