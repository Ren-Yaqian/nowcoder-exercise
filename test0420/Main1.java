package test0420;

import java.util.Scanner;
//n!末尾0的个数
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        while(n!=0) {
            count += n / 5;
            n /= 5;
        }
        System.out.println(count);
    }
}
