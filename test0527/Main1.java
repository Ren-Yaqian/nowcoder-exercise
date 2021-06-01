package test0527;

import java.util.Scanner;

public class Main1{
    public static float count(int n) {
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }else{
            return (n-1)*(count(n-1)+count(n-2));
        }
    }
    //函数用来求阶乘，也是递归，最后得到分母
    public static float probability(int n){
        if(n==0){
            return 1;
        }else{
            return n*probability(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            int n = sc.nextInt();
            float result = (count(n)/probability(n))*100;
            System.out.println(String.format("%.2f", result) + "%");
        } while (sc.hasNext());
    }
}
