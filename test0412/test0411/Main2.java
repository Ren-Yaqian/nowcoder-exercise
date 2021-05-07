package test0411;

import java.util.Scanner;

//删除公共字符
public class Main2 {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        String S1=sca.nextLine();
        String S2=sca.nextLine();
        for(int i=0;i<S2.length();i++){
            char s=S2.charAt(i);
//            char[]S=S1.toCharArray();
//
            S1=S1.replace(s,'\0');
        }

        System.out.println(S1);
    }
}
