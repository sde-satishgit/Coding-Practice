import java.util.Scanner;

public class Armstrong_Practise_07_02_26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inpNo = sc.nextInt();
		
		String result = checkArmstrong(inpNo);
		
		System.out.println("result = " + result );
		sc.close();
		
		//153,1634

	}

	private static String checkArmstrong(int inpNo) {
		
		
		String strNo = String.valueOf(inpNo);
		char[] charArray = strNo.toCharArray();
		int length = strNo.length();
		int add = 0;
		String res;
		for(Character c : charArray) {
			
			Integer valueOf = Integer.valueOf(c.toString());
			int pow = (int)Math.pow(valueOf, length);
			add = add+ pow;
			
		}
		
		if(add == inpNo) {
			res = "Yes";
			return res;
		}
		
		return "No";
	}

}
