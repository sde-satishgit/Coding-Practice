package BasicPrograms;

import java.util.ArrayList;
import java.util.List;

public class Armstrong_06_03_24
{
    public static void main(String[] args) {
        String s= "153";
        //1^3 + 5^3 + 3^3 = 153
        char ch [] = s.toCharArray();

        List<Character> list = new ArrayList<>();
        for(char ch1 : ch){
            list.add(ch1);
        }
        int size = list.size();
        int add=0;
        for(Character ch2 : list){
           int m =(int) Math.pow(Integer.parseInt(ch2.toString()),size);

           add = add + m;
        }

        if(add == Integer.parseInt(s)){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong number");
        }
    }
}
