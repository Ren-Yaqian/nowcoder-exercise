package test0518;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            BigInteger[] arr=new BigInteger[3];
            for(int i = 0; i < 3; i++) {
                arr[i]=new BigInteger(in.next());
            }
            Arrays.sort(arr);
            if(arr[0].add(arr[1]).compareTo(arr[2])>0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}

