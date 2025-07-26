package BasicPrograms;

public class Palindrom_04_03_2024 {

    public void print(int number){
        String v = String.valueOf(number);
       char ch[] =  v.toCharArray();
       StringBuffer stringBuffer = new StringBuffer();
       for(int i=ch.length-1;i>=0;i--){
           stringBuffer.append(ch[i]);
       }
       int n = Integer.parseInt(stringBuffer.toString());
       if(n==number){
           System.out.println("Palindrom");
       }
       else{
           System.out.println("Not Palindrom");
       }
    }
    public static void main(String[] args) {
        Palindrom_04_03_2024 palindrom_04_03_2024 = new Palindrom_04_03_2024();
        palindrom_04_03_2024.print(11211);
    }
}
