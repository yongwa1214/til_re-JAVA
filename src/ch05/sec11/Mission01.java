package ch05.sec11;

import java.util.Arrays;

public class Mission01 {
    public static void main(String[] args) {
        int sum = 0;

        /*for(int i = 0; i<args.length; i++){
            int j = Integer.parseInt(args[i]);
            sum += j;
        }*/

        for(String item: args){
            int n = Integer.parseInt(item);
            sum += n;
        }
        System.out.println("합계: " + sum);


    }
}
