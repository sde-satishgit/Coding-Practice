
public class Fibonnacci_Practise_07_02_26 {

	public static void main(String[] args) {

		
		int fn =0;
		int sn =1;
		
		for(int i=2;i<=10;i++) {
			System.out.println(fn);
			
			int next = fn + sn;
			fn=sn;
			sn=next;
			
			
		}
    }
}
