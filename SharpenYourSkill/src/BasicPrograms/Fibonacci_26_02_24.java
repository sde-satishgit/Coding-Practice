package BasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci_26_02_24 {

    private void print(int iteration){
        int arr[] = new int[iteration];
        arr[0] =0;
        arr[1] =1;
        List<Integer> list = new ArrayList<>();
        for(int i=2;i<iteration ;i++){
            //list.add(i);
            int length = arr.length-1;
            int currnt = arr[length];
            int pre = arr[currnt-2];
            arr[i] = currnt + pre;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Fibonacci_26_02_24 fib = new Fibonacci_26_02_24();
        //fib.print(10);

        int n1=0,n2=1,count=10,n3;
    System.out.print(n1+","+n2);
        for(int i=2;i<count;i++){
        n3 = n1+n2;
            System.out.print(","+n3);

            n1=n2;
            n2=n3;
        }
    }
}
