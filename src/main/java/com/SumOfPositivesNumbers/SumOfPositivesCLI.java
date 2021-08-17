package com.SumOfPositivesNumbers;

public class SumOfPositivesCLI {
    public static void main(String[] args) {
        int sum = 0;
        if (args.length == 0){
            System.out.println(0);
        }else{
            for(int i = 0; i <args.length;i++){
                int x =Integer.parseInt(args[i]);
                if( x > 0){
                    sum+= x;
                }
            }
            System.out.println(sum);
        }
    }
}
