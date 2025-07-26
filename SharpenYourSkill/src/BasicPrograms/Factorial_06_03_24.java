package BasicPrograms;

public class Factorial_06_03_24 {
    public static void main(String[] args) {

        int n=6;
        int add=1;
        for(int i=n;i>0;i--){
            add = add * i;
        }
        System.out.println(add);
    }
}
