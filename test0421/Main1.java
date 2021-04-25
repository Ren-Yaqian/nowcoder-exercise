package test0421;//package test0421;
//
//import java.util.Scanner;
//
//public class Main1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int f1=0;
//        int f2=1;
//
//        while(n>1){
//            int f3=f1+f2;
//            f1=f2;
//            f2=f3;
//        }
//        System.out.println((f2-n)>(n-f1)?n-f1:f2-n);
//    }
//}
import java.util.Scanner;
public class Main1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        while(b < n){
            int tmp = a + b;
            a = b;
            b = tmp;

        }
        System.out.print((b-n)>(n-a)?n-a:b-n);
    }
}