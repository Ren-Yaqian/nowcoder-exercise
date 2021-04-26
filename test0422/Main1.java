package test0422;

import java.util.Scanner;

//最近公共祖先
public class Main1 {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int a=sca.nextInt();
        int b=sca.nextInt();
        while(a!=b){
            if(a>b){
                a/=2;
            }else
            b/=2;
        }
        System.out.println(a);
    }

}
