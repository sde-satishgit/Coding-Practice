package BasicPrograms;

public class PrimeNumber_04_03_2024 {

    public void print(int number){
      int ite = number/2;
      boolean flag = false;

        for(int i=2;i<=ite;i++){
            if(number%i==0){
                flag = true;
            }

        }
        if(flag){
            System.out.println(number + " is not prime");
        }
        else {
            System.out.println(number + " is prime");

        }
    }
    public static void main(String[] args) {
        PrimeNumber_04_03_2024 primeNumber_04_03_2024 = new PrimeNumber_04_03_2024();
        primeNumber_04_03_2024.print(10);
    }
}
