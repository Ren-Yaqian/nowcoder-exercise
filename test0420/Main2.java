package test0420;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch = s.toCharArray();
        int len=ch.length;
        for(int i=len-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}
